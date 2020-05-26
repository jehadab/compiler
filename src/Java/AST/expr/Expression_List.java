package Java.AST.expr;

import Java.AST.Node;

import java.util.ArrayList;

/**
 * Created by Jehad on 5/21/2020.
 */
public class Expression_List  {


    String termenal_node;
    String Op;
    Expression_List left_expr ;
    Expression_List right_expr ;

    public String getOp() {
        return Op;
    }

    public void setOp(String op) {
        Op = op;
    }

    public Expression_List getLeft_expr() {
        return left_expr;
    }

    public void setLeft_expr(Expression_List left_expr) {
        this.left_expr = left_expr;
    }

    public Expression_List getRight_expr() {
        return right_expr;
    }

    public void setRight_expr(Expression_List right_expr) {
        this.right_expr = right_expr;
    }

    public String getTermenal_node() {
        return termenal_node;
    }

    public void setTermenal_node(String termenal_node) {
        this.termenal_node = termenal_node;
    }
}
