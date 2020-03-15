package Java.AST.instruction.Returning;

import Java.AST.arrayandjson.array_base_fom_with_index;
import Java.AST.arrayandjson.variablefromobject;
import Java.AST.assignmnet.assign_Array;
import Java.AST.creating.assign_variable;
import Java.AST.creating.jsonassign;
import Java.AST.expr.Arithmatic_expr;
import Java.AST.expr.Boolean_Infunction_Statment;
import Java.AST.instruction.CallFunction;
import Java.AST.instruction.arithmetic_infunction_statment;
import org.antlr.v4.runtime.Token;

public class return_type  {
Token tt ;
    variablefromobject from ;
    String name;
    assign_variable v ;
    assign_Array a ;
    jsonassign assign ;
    CallFunction call ;
    Boolean_Infunction_Statment booleanes ;
    Arithmatic_expr arithmatic ;
    arithmetic_infunction_statment infunction;
    array_base_fom_with_index wihindex ;

    public void setTt(Token tt) {
        this.tt = tt;
    }

    public Token getTt() {
        return tt;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setFrom(variablefromobject from) {
        this.from = from;
    }

    public variablefromobject getFrom() {
        return from;
    }


    public void setV(assign_variable v) {
        this.v = v;
    }

    public assign_variable getV() {
        return v;
    }


    public void setA(assign_Array a) {
        this.a = a;
    }

    public assign_Array getA() {
        return a;
    }


    public void setAssign(jsonassign assign) {
        this.assign = assign;
    }

    public jsonassign getAssign() {
        return assign;
    }


    public void setCall(CallFunction call) {
        this.call = call;
    }

    public CallFunction getCall() {
        return call;
    }


    public void setBooleanes(Boolean_Infunction_Statment booleanes) {
        this.booleanes = booleanes;
    }

    public Boolean_Infunction_Statment getBooleanes() {
        return booleanes;
    }


    public void setArithmatic(Arithmatic_expr arithmatic) {
        this.arithmatic = arithmatic;
    }

    public Arithmatic_expr getArithmatic() {
        return arithmatic;
    }

    public void setInfunction(arithmetic_infunction_statment infunction) {
        this.infunction = infunction;
    }

    public arithmetic_infunction_statment getInfunction() {
        return infunction;
    }

    public void setWihindex(array_base_fom_with_index wihindex) {
        this.wihindex = wihindex;
    }

    public array_base_fom_with_index getWihindex() {
        return wihindex;
    }


}
