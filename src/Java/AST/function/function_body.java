package Java.AST.function;
import Java.AST.instruction.*;
import Java.AST.Node;
import Java.AST.create.generalcreating;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// could have error in the functionbody ....
public class function_body extends Node {


    public List<Object> getInstructions() {
        return nodes;
    }

    public void setlist(List<Object> instructions) {
        this.nodes = instructions;
    }
    public void addNode(Object Node){
        this.nodes.add(Node);
    }


    List<Object> nodes = new ArrayList<Object>();




}
