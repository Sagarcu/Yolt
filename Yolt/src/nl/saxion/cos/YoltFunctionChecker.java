package nl.saxion.cos;

import org.antlr.v4.runtime.RuleContext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class YoltFunctionChecker extends YoltBaseVisitor<DataType> {
    private final Map<String, FunctionSymbol> functionSymbols = new HashMap<>();

    @Override
    public DataType visitApplication(YoltParser.ApplicationContext ctx) {
        for(int i = 0; i < ctx.function_declaration().size(); i++)
        {
            visit(ctx.function_declaration(i));
        }

        return null;
    }

    @Override
    public DataType visitFunction_declaration(YoltParser.Function_declarationContext ctx) {
        ArrayList<DataType> dataTypes = new ArrayList<>(); //Fill all extra sent types in here!
        String functionName = ctx.IDENTIFIER().toString();

        if (functionSymbols.containsKey(functionName))
        {
            throw new YoltCompilerException("There already exists a function with the name " + functionName + "!");
        }

        for(int i = 0; i < ctx.variables().size(); i++)
        {
            if(ctx.variables(i).STRING() != null) dataTypes.add(DataType.STRING);
            else if (ctx.variables(i).INT() != null) dataTypes.add(DataType.INT);
            else if (ctx.variables(i).BOOLEAN() != null) dataTypes.add(DataType.BOOLEAN);
            else if (ctx.variables(i).COINS() != null) dataTypes.add(DataType.COINS);
        }

        if(ctx.INT() != null || ctx.COINS() != null || ctx.BOOLEAN() != null || ctx.STRING() != null)
        {
            if(ctx.return_statement() == null)
            {
                throw new YoltCompilerException("No return statement found!");
            }

            if(ctx.INT() != null) functionSymbols.put(ctx.IDENTIFIER().toString(), new FunctionSymbol(ctx.IDENTIFIER().toString(), FunctionType.INT, dataTypes));
             else if (ctx.STRING() != null) functionSymbols.put(ctx.IDENTIFIER().toString(), new FunctionSymbol(ctx.IDENTIFIER().toString(), FunctionType.STRING, dataTypes));
             else if (ctx.COINS() != null) functionSymbols.put(ctx.IDENTIFIER().toString(), new FunctionSymbol(ctx.IDENTIFIER().toString(), FunctionType.COINS, dataTypes));
             else if (ctx.BOOLEAN() != null) functionSymbols.put(ctx.IDENTIFIER().toString(), new FunctionSymbol(ctx.IDENTIFIER().toString(), FunctionType.BOOLEAN, dataTypes));
        } else
        {
            functionSymbols.put(ctx.IDENTIFIER().toString(), new FunctionSymbol(ctx.IDENTIFIER().toString(), FunctionType.VOID, dataTypes));
            if (ctx.return_statement() != null)
            {
                throw new YoltCompilerException("Return statement found in a function without type!");
            }
        }

        for(int i = 0; i < ctx.statement().size(); i++)
        {
            if (ctx.statement().get(i).break_statement() != null)
            {
                throw new YoltCompilerException("Break statement found outside of a loop!");
            }
        }
        return super.visitFunction_declaration(ctx);
    }

    public Map<String, FunctionSymbol> getFunctionSymbols()
    {
        return functionSymbols;
    }
}
