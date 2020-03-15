package Java.AST.instruction;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jehad on 1/2/2020.
 */
public class functional_instuctions extends  instructions {

    public functional_instuctions() {
        this.instructions = instructions = new ArrayList<>();
    }

    public List<Java.AST.instruction.instructions> getInstructions() {
        return instructions;
    }

    public void setInstructions(List<Java.AST.instruction.instructions> instructions) {
        this.instructions = instructions;
    }
    public void addinstruction (instructions instructions)
    {
        this.instructions.add(instructions);
    }

    List<instructions> instructions;

}
