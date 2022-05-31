package nl.saxion.cos;

import java.util.ArrayList;

public class FunctionSymbol {
    private final String name;
    private final DataType functionType;
    private final ArrayList<DataType> types;

    public FunctionSymbol(String name, DataType functionType, ArrayList<DataType> types) {
        this.name = name;
        this.functionType = functionType;
        this.types = types;
    }

    public String getName() {
        return name;
    }

    public DataType getFunctionType() {
        return functionType;
    }

    public ArrayList<DataType> getTypes() {
        return types;
    }
}
