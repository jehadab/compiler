package Java.SymbolTable;

import java.util.HashMap;
import java.util.Map;

public class Type {

    private String name;
    private Map<String , Type> columns = new HashMap<String, Type>();


    public final static String NUMBER_CONST = "number";
    public final static String STRING_CONST = "string";
    public final static String BOOLEAN_CONST = "boolean";


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Type> getColumns() {
        return columns;
    }

    public void setColumns(Map<String, Type> columns) {
        this.columns = columns;
    }
}
