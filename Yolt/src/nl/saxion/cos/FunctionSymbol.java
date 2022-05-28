package nl.saxion.cos;

import java.util.ArrayList;

public class FunctionSymbol {
    private String name;
    private FunctionType functionType;
    private ArrayList<DataType> types;

    public FunctionSymbol(String name, FunctionType functionType, ArrayList<DataType> types) {
        this.functionType = functionType;
        this.types = types;
    }

    public String getName() {
        return name;
    }

    public FunctionType getFunctionType() {
        return functionType;
    }

    public ArrayList<DataType> getTypes() {
        return types;
    }
}
