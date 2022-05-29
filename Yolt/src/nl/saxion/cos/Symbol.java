package nl.saxion.cos;

public class Symbol {
    private final String name;
    private final DataType type;
    private final boolean isGlobal;
    private final int localSlot;

    public Symbol(String name, DataType type, boolean isGlobal, int localSlot) {
        this.name = name;
        this.type = type;
        this.isGlobal = isGlobal;
        this.localSlot = localSlot;
    }

    public String getName() {
        return name;
    }

    public DataType getType() {
        return type;
    }

    public boolean isGlobal() {
        return isGlobal;
    }

    public int getLocalSlot() {
        return localSlot;
    }
}
