import java.util.*;
public enum Module_enum {
    BSP("Business Statistics in Python","ITSD001"),
    PS("Problem Solving","ITSD002"),
    PF("Problem Fundamental","ITSD003"),
    CN("Communication and Network","ITSD004");
    
    private final Module name;
    private final String moduleCode;
    
    Module_enum(String name, String moduleCode) {
        this.name = new Module(name);
        this.moduleCode = moduleCode;

    }
    public Module getName() {
        return name;
    }
    public String getModuleCode() {
        return moduleCode;
    }
}
