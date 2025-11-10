package exceptions;

public class OperandNotInteger extends MyException {
    public OperandNotInteger() {
        super("Operand is not an integer:");
    }
}
