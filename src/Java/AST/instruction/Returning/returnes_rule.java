package Java.AST.instruction.Returning;

import Java.AST.instruction.arithmetic_infunction_statment;

public class returnes_rule   {
    return_type t ;

    public void setT(return_type t) {
        this.t = t;
    }

    public return_type getT() {
        return t;
    }
    arithmetic_infunction_statment arithmatic ;

    public void setArithmatic(arithmetic_infunction_statment arithmatic) {
        this.arithmatic = arithmatic;
    }

    public arithmetic_infunction_statment getArithmatic() {
        return arithmatic;
    }
    
}
