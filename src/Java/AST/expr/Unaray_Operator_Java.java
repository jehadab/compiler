package Java.AST.expr;

import Java.AST.Node;

/**
 * Created by Jehad on 5/27/2020.
 */
public class Unaray_Operator_Java extends Node {

    String Op;
    Expression_List expression_list;


    public String getOp() {
        return Op;
    }

    public void setOp(String op) {
        Op = op;
    }

    public Expression_List getExpression_list() {
        return expression_list;
    }

    public void setExpression_list(Expression_List expression_list) {
        this.expression_list = expression_list;
    }

}
