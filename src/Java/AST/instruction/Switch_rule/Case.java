package Java.AST.instruction.Switch_rule;

import Java.AST.instruction.functional_instuctions;

/**
 * Created by Jehad on 1/5/2020.
 */
public class Case extends functional_instuctions {
    public String getVariable_name() {
        return variable_name;
    }

    public void setVariable_name(String variable_name) {
        this.variable_name = variable_name;
    }

    public String getTermenal_node() {
        return termenal_node;
    }

    public void setTermenal_node(String termenal_node) {
        this.termenal_node = termenal_node;
    }

    String variable_name ;
    String termenal_node ;

}
