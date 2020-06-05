package Java.AST.expr;

import Java.AST.Node;

/**
 * Created by Jehad on 5/27/2020.
 */
public class One_Line_If_Expression extends Node {

    public Expression_List getBoolean_condition() {
        return boolean_condition;
    }

    public void setBoolean_condition(Expression_List boolean_condition) {
        this.boolean_condition = boolean_condition;
    }

    public Expression_List getFirstelement() {
        return firstelement;
    }

    public void setFirstelement(Expression_List firstelement) {
        this.firstelement = firstelement;
    }

    public Expression_List getSecond_element() {
        return second_element;
    }

    public void setSecond_element(Expression_List second_element) {
        this.second_element = second_element;
    }

    Expression_List boolean_condition ;
    Expression_List firstelement;
    Expression_List second_element;
}
