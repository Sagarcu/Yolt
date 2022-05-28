package nl.saxion.cos;

public class Symbol {
    private final String name;
    private final DataType type;
    private final int localSlot;

    public Symbol(String name, DataType type, int localSlot) {
        this.name = name;
        this.type = type;
        this.localSlot = localSlot;
    }

    public String getName() {
        return name;
    }

    public DataType getType() {
        return type;
    }


    public int getLocalSlot() {
        return localSlot;
    }
}
