package Java.AST.instruction.IF_rule;

import Java.AST.expr.Boolean_Expr;
import Java.AST.expr.Boolean_Infunction_Statment;
import Java.AST.instruction.functional_instuctions;
import Java.AST.instruction.instructions;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jehad on 1/1/2020.
 */
public class if_else extends functional_instuctions {

    //return type


    public if_else() {
        else_if = new ArrayList<>();
    }

    public void add_Else_if_rule_in_if(Java.AST.instruction.instructions node){
        else_if.add(node);
    }

    public List<Java.AST.instruction.instructions> getElse_if() {
        return else_if;
    }

    public void setElse_if(List<Java.AST.instruction.instructions> else_if) {
        this.else_if = else_if;
    }

    public Java.AST.instruction.instructions getElse_rule() {
        return else_rule;
    }

    public void setElse_rule(Java.AST.instruction.instructions else_rule) {
        this.else_rule = else_rule;
    }


    public Boolean_Infunction_Statment getBoolean_Infunction_Statment() {
        return boolean_Infunction_Statment;
    }

    public void setBoolean_Infunction_Statment(Boolean_Infunction_Statment boolean_Infunction_Statment) {
        this.boolean_Infunction_Statment = boolean_Infunction_Statment;
    }

    Boolean_Infunction_Statment boolean_Infunction_Statment;

    private List<instructions> else_if ;

    private instructions else_rule ;

}
