package Java.AST.function;

import Java.AST.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jehad on 5/26/2020.
 */
public class Sub_function_body extends Node {

    public List<Object> getInstructions() {
        return nodes;
    }

    public void setInstructions(List<Object> instructions) {
        this.nodes = instructions;
    }
    public void addNode(Object Node){
        this.nodes.add(Node);
    }


    List<Object> nodes = new ArrayList<Object>();



}
