package Java.AST.instruction;

import Java.AST.Node;

public class instructions   extends Node {
    public String getInstrucation_name() {
        return instrucation_name;
    }

    public void setInstrucation_name(String instrucation_name) {
        this.instrucation_name = instrucation_name;
    }

    private String instrucation_name ;
}
