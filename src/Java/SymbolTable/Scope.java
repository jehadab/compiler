package Java.SymbolTable;

import java.util.LinkedHashMap;
import java.util.Map;

public class Scope {
    private String id;
    private Scope parent;
    private Map<String, Symbol> symbolMap = new LinkedHashMap< String , Symbol >();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public Scope getParent() {
        return parent;
    }

    public void setParent(Scope parent) {
        this.parent = parent;
    }

    public Map<String, Symbol> getSymbolMap() {
        return symbolMap;
    }

    public void setSymbolMap(Map<String, Symbol> symbolMap) {
        this.symbolMap = symbolMap;
    }
    public void addSymbol(String name, Symbol symbol) {
        this.symbolMap.put(name,symbol);
    }
}
