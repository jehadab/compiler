package Java.AST.creating;

import Java.AST.Node;
import Java.AST.assignmnet.Variable_with_opretor;
import Java.AST.expr.Arithmatic_expr;
import Java.AST.expr.Boolean_Infunction_Statment;
import com.sun.org.apache.bcel.internal.generic.Select;

import java.util.ArrayList;
import java.util.List;

public class assign_variable extends Node {   // to do the arithmatic structure one ....


    public assign_variable(){
        this.variable_with_opretor = new ArrayList<>();
    }

    public Arithmatic_expr getArithmatic_expr() {
        return arithmatic_expr;
    }

    public void setArithmatic_expr(Arithmatic_expr arithmatic_expr) {
        this.arithmatic_expr = arithmatic_expr;
    }

    public Boolean_Infunction_Statment getBoolean_infunction_statment() {
        return boolean_infunction_statment;
    }

    public void setBoolean_infunction_statment(Boolean_Infunction_Statment boolean_infunction_statment) {
        this.boolean_infunction_statment = boolean_infunction_statment;
    }

    public Select getSelect() {
        return select;
    }

    public void setSelect(Select select) {
        this.select = select;
    }

    public List<Variable_with_opretor> getVariable_with_opretor() {
        return variable_with_opretor;
    }

    public void setVariable_with_opretor(List<Variable_with_opretor> variable_with_opretor) {
        this.variable_with_opretor = variable_with_opretor;
    }

    List<Variable_with_opretor> variable_with_opretor ;

    Arithmatic_expr arithmatic_expr;
    Boolean_Infunction_Statment boolean_infunction_statment;
    Select select ;//todo select from SQL
    //factored_select_stmt
}
