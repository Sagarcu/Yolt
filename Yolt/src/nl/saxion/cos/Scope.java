package nl.saxion.cos;

import java.util.HashMap;
import java.util.Map;

public class Scope {

    private Map<String, Symbol> symbols = new HashMap<>();


    private Scope parentScope;
    private int numLocals = 1;


    public void declareVariable( Symbol symbol ) {
        symbols.put( symbol.getName(), symbol );
        numLocals++;
    }

    public Symbol lookupVariable( String name ) {
        Symbol s = symbols.get(name);
        if( s == null && parentScope != null )
            return parentScope.lookupVariable(name);
        return s;
    }

    public Scope openScope() {
        Scope childScope = new Scope();
        childScope.parentScope = this;
        return childScope;
    }

    public Scope closeScope() {
        return parentScope;
    }

    public int getNumLocals() {
        return numLocals;
    }

    public void increaseNumLocals()
    {
        numLocals += 1;
    }

}
