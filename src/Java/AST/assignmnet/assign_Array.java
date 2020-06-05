package Java.AST.assignmnet;

import Java.AST.Node;
import Java.AST.arrayandjson.Array_base_form_with_operetor;
import Java.AST.expr.Arithmatic_expr;
import Java.AST.expr.Boolean_Infunction_Statment;
import Java.AST.expr.Expression;

import java.util.ArrayList;
import java.util.List;

public class assign_Array extends Node {   // to do the arithmatic statmnet .......


    List<Array_base_form_with_operetor> array_base_form_with_operetors ;
    Expression expression ;

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public assign_Array (){
        array_base_form_with_operetors = new ArrayList<>();
    }


    public List<Array_base_form_with_operetor> getArray_base_form_with_operetors() {
        return array_base_form_with_operetors;
    }

    public void setArray_base_form_with_operetors(List<Array_base_form_with_operetor> array_base_form_with_operetors) {
        this.array_base_form_with_operetors = array_base_form_with_operetors;
    }



}
