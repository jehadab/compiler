package Java.AST.function;

import Java.AST.FunctionDeclaration;
import Java.AST.ParametesandArgs.args;
import Java.AST.userandomname;

import java.util.ArrayList;
import java.util.List;

public class function_header extends FunctionDeclaration {
    // String functionname ;
    //function_body body = new function_body();
    //userandomname use = new userandomname();
    private List<args> arg = new ArrayList<args>();
    String name ;
    // list of parameteress


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setArg(List<args> arg) {
        this.arg = arg;
    }

    public List<args> getArg() {
        return arg;
    }
    public void  pri (){
        for (int i=0;i<arg.size();i++){
            // System.out.println(arg.get(i).getCreating().getWihtoutassig().getVar().getN());
            if(arg.get(i).getCreating().getWihtoutassig().getArray()!=null)
                System.out.println("array variable "+arg.get(i).getCreating().getWihtoutassig().getArray().getWihtoutindex().getName());
            else if (arg.get(i).getCreating().getWihtoutassig().getVar().getN()!=null)
                System.out.println("variablr "+arg.get(i).getCreating().getWihtoutassig().getVar().getN());
        }

    }
    public void additemtoarglist(args a ){
        this.arg.add(a);

    }

}
