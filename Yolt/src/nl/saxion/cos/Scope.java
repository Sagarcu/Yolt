package nl.saxion.cos;

import java.util.HashMap;
import java.util.Map;

public class Scope {

    private Map<String, Symbol> symbols = new HashMap<>();
    private Scope parentScope;

    public void declareVariable( Symbol symbol ) {
        symbols.put( symbol.getName(), symbol );
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
}
