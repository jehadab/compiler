package Java.AST.instruction.loops;
import Java.AST.expr.Boolean_Infunction_Statment;
import Java.AST.instruction.functional_instuctions;

/**
/**
 * Created by Jehad on 1/5/2020.
 */
public class While_Rule extends functional_instuctions {
    public Boolean_Infunction_Statment getBoolean_infunction_statment() {
        return boolean_infunction_statment;
    }

    public void setBoolean_infunction_statment(Boolean_Infunction_Statment boolean_infunction_statment) {
        this.boolean_infunction_statment = boolean_infunction_statment;
    }

    Boolean_Infunction_Statment boolean_infunction_statment ;
}
