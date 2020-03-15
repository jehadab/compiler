package Java.AST.assignmnet;

import Java.AST.Node;
import Java.AST.arrayandjson.Array_base_form_with_operetor;
import Java.AST.expr.Arithmatic_expr;
import Java.AST.expr.Boolean_Infunction_Statment;

import java.util.ArrayList;
import java.util.List;

public class assign_Array extends Node {   // to do the arithmatic statmnet .......


    List<Array_base_form_with_operetor> array_base_form_with_operetors ;

    Arithmatic_expr arithmatic_expr;
    Boolean_Infunction_Statment boolean_infunction_statment;

    public assign_Array (){
        array_base_form_with_operetors = new ArrayList<>();
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

    public List<Array_base_form_with_operetor> getArray_base_form_with_operetors() {
        return array_base_form_with_operetors;
    }

    public void setArray_base_form_with_operetors(List<Array_base_form_with_operetor> array_base_form_with_operetors) {
        this.array_base_form_with_operetors = array_base_form_with_operetors;
    }



}
