package Java.AST.creating;

import Java.AST.instruction.non_functional_instructions;

public class gneralcreating extends non_functional_instructions {
    createwihtoutassign wihtoutassig  ;
    create_with_assign withassign ;
    String name ;//todo remove replace with create with assign

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setWihtoutassig(createwihtoutassign wihtoutassig) {
        this.wihtoutassig = wihtoutassig;
    }

    public createwihtoutassign getWihtoutassig() {
        return wihtoutassig;
    }

    public void setWithassign(create_with_assign withassign) {
        this.withassign = withassign;
    }

    public create_with_assign getWithassign() {
        return withassign;
    }
    
}

