package exceptions;

public class VariableAlreadyDefined extends RuntimeException {
    public VariableAlreadyDefined(String id) {
        super("Variable already defined: " + id);
    }
}
