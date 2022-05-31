package nl.saxion.cos;

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
            throw new YoltCompilerException("ERROR: There already exists a function with the name " + functionName + "!");
        }

        for(int i = 0; i < ctx.variables().size(); i++)
        {
            if(ctx.variables(i).STRING() != null) dataTypes.add(DataType.WORDS);
            else if (ctx.variables(i).INT() != null) dataTypes.add(DataType.NUMBERS);
            else if (ctx.variables(i).BOOLEAN() != null) dataTypes.add(DataType.BOOL);
            else if (ctx.variables(i).COINS() != null) dataTypes.add(DataType.COINS);
        }

        if(ctx.INT() != null || ctx.COINS() != null || ctx.BOOLEAN() != null || ctx.STRING() != null)
        {
            if(ctx.return_statement() == null)
            {
                throw new YoltCompilerException("ERROR: No return statement found in function [" + functionName + "].");
            }

             if(ctx.INT() != null) functionSymbols.put(ctx.IDENTIFIER().toString(), new FunctionSymbol(ctx.IDENTIFIER().toString(), DataType.NUMBERS, dataTypes));
             else if (ctx.STRING() != null) functionSymbols.put(ctx.IDENTIFIER().toString(), new FunctionSymbol(ctx.IDENTIFIER().toString(), DataType.WORDS, dataTypes));
             else if (ctx.COINS() != null) functionSymbols.put(ctx.IDENTIFIER().toString(), new FunctionSymbol(ctx.IDENTIFIER().toString(), DataType.COINS, dataTypes));
             else if (ctx.BOOLEAN() != null) functionSymbols.put(ctx.IDENTIFIER().toString(), new FunctionSymbol(ctx.IDENTIFIER().toString(), DataType.BOOL, dataTypes));
        } else
        {
            functionSymbols.put(ctx.IDENTIFIER().toString(), new FunctionSymbol(ctx.IDENTIFIER().toString(), DataType.VOID, dataTypes));
            if (ctx.return_statement() != null)
            {
                throw new YoltCompilerException("ERROR: Return statement found in function [" + functionName + "] which shouldn't return a value!");
            }
        }
        return null;
    }

    public Map<String, FunctionSymbol> getFunctionSymbols()
    {
        return functionSymbols;
    }
}
