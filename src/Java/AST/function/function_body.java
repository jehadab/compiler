package Java.AST.function;
import Java.AST.instruction.*;
import Java.AST.Node;
import Java.AST.create.generalcreating;

import java.util.ArrayList;
import java.util.List;

// could have error in the functionbody ....
public class function_body extends Node {

    public function_body(){
        this.instructions = new ArrayList<>();
    }

    public List<Java.AST.instruction.instructions> getInstructions() {
        return instructions;
    }

    public void setInstructions(List<Java.AST.instruction.instructions> instructions) {
        this.instructions = instructions;
    }
    public void addInstraction(instructions instruction){
        this.instructions.add(instruction);
    }


    List<instructions> instructions ;




}
