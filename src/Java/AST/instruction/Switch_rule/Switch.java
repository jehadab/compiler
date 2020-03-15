package Java.AST.instruction.Switch_rule;

import Java.AST.instruction.arithmetic_infunction_statment;
import Java.AST.expr.Arithmatic_expr;
import Java.AST.instruction.non_functional_instructions;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jehad on 1/5/2020.
 */
public class Switch extends non_functional_instructions  {

    public Switch(){
        this.cases = new ArrayList<>();
    }

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

    public Java.AST.instruction.arithmetic_infunction_statment getArithmetic_infunction_statment() {
        return arithmetic_infunction_statment;
    }

    public void setArithmetic_infunction_statment(Java.AST.instruction.arithmetic_infunction_statment arithmetic_infunction_statment) {
        this.arithmetic_infunction_statment = arithmetic_infunction_statment;
    }

    public Arithmatic_expr getArithmatic_expr() {
        return arithmatic_expr;
    }

    public void setArithmatic_expr(Arithmatic_expr arithmatic_expr) {
        this.arithmatic_expr = arithmatic_expr;
    }

    public List<Case> getCases() {
        return cases;
    }

    public void setCases(List<Case> cases) {
        this.cases = cases;
    }

    public Deafult getDeafult() {
        return deafult;
    }

    public void setDeafult(Deafult deafult) {
        this.deafult = deafult;
    }

    String variable_name;
    String termenal_node;
    arithmetic_infunction_statment arithmetic_infunction_statment;
    Arithmatic_expr arithmatic_expr;

    List<Case>cases ;
    Deafult deafult ;

}
