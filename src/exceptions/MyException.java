package exceptions;

public class MyException extends RuntimeException {
    public MyException(String msg) {
        super(msg);
    }

    @Override
    public String toString() {
        return "MyException: " + getMessage();
    }
}
