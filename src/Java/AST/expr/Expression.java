package Java.AST.expr;

import Java.AST.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jehad on 5/19/2020.
 */
public class Expression extends Node {

    public Expression ()
    {
        expressions_list = new ArrayList<>();
    }


    public List<Expression> getExpressions_list() {
        return expressions_list;
    }

    public void setExpressions_list(List<Expression> expressions_list) {
        this.expressions_list = expressions_list;
    }

    public String getTermenal_node() {
        return termenal_node;
    }

    public void setTermenal_node(String termenal_node) {
        this.termenal_node = termenal_node;
    }

    public String getVariable_name() {
        return variable_name;
    }

    public void setVariable_name(String variable_name) {
        this.variable_name = variable_name;
    }

    List<Expression> expressions_list ;

    String termenal_node;
    String variable_name;
   /* String identyfire;
    String call_function;
    String varible_from_object;
    String array_base_form_with_index;
    String NUMERIC_LITERAL;
    char ONE_CHAR_LETTER;*/
}
