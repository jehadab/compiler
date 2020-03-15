package Java.AST.arrayandjson;

import Java.AST.Node;
import Java.AST.ParametesandArgs.args;

import java.util.ArrayList;
import java.util.List;

public class array_left_side extends Node {
    //private List<Integer > in = new ArrayList<Integer>();
    //private List<Character > ch  = new ArrayList<Character>();
    //private List<Boolean> bol = new ArrayList<Boolean>();

    array_value_form form ;

    public void setForm(array_value_form form) {
        this.form = form;
    }

    public array_value_form getForm() {
        return form;
    }

}
