package execpion;

public class CalculatorZeroException extends IllegalArgumentException{
    public CalculatorZeroException() {
    }

    public CalculatorZeroException(String s) {
        super(s);
    }

    public CalculatorZeroException(String message, Throwable cause) {
        super(message, cause);
    }

    public CalculatorZeroException(Throwable cause) {
        super(cause);
    }
}
