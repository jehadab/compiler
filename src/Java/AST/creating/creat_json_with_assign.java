package Java.AST.creating;

import Java.AST.arrayandjson.jsonform;
import Java.AST.arrayandjson.jsonstatment;

public class creat_json_with_assign extends create_with_assign {
    jsonassign assingit ;

    public void setAssingit(jsonassign assingit) {
        this.assingit = assingit;
    }

    public jsonassign getAssingit() {
        return assingit;
    }

}
