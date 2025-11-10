package exceptions;
import exceptions.MyException;

public class OperandNotBoolean extends MyException {
    public OperandNotBoolean() { super("Operand is not a boolean:"); }
}
