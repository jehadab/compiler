package Java.AST.expr;

import Java.AST.Node;
import Java.AST.assignmnet.assignment;

/**
 * Created by Jehad on 5/27/2020.
 */
public class Bracket_Expression extends Node {

    Expression_List expression_list ;
    assignment assign ;

    public assignment getAssign() {
        return assign;
    }

    public void setAssign(assignment assign) {
        this.assign = assign;
    }

    public Expression_List getExpression_list() {
        return expression_list;
    }

    public void setExpression_list(Expression_List expression_list) {
        this.expression_list = expression_list;
    }
}
