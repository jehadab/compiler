package Java.AST.arrayandjson;

import Java.AST.Node;
import Java.AST.expr.Arithmatic_expr;
import Java.AST.instruction.arithmetic_infunction_statment;

/**
 * Created by Jehad on 1/6/2020.
 */
public class Array_base_form_variables extends Node {


    public String getVariable_name() {
        return variable_name;
    }

    public void setVariable_name(String variable_name) {
        this.variable_name = variable_name;
    }

    public Arithmatic_expr getArithmatic_expr() {
        return arithmatic_expr;
    }

    public void setArithmatic_expr(Arithmatic_expr arithmatic_expr) {
        this.arithmatic_expr = arithmatic_expr;
    }

    public Java.AST.instruction.arithmetic_infunction_statment getArithmetic_infunction_statment() {
        return arithmetic_infunction_statment;
    }

    public void setArithmetic_infunction_statment(Java.AST.instruction.arithmetic_infunction_statment arithmetic_infunction_statment) {
        this.arithmetic_infunction_statment = arithmetic_infunction_statment;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    String variable_name;
    Arithmatic_expr arithmatic_expr;
    arithmetic_infunction_statment arithmetic_infunction_statment;
    String Number;

}
