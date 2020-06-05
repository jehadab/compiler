package Java.AST.expr;

import Java.AST.Node;

/**
 * Created by Jehad on 5/27/2020.
 */
public class Variable_Name extends Node {

    String variable_name;

    public String getVariable_name() {
        return variable_name;
    }

    public void setVariable_name(String variable_name) {
        this.variable_name = variable_name;
    }

}
