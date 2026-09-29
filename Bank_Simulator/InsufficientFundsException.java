package Bank_Simulator;

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException (String message) {
        super(message);
    }
}
