package pl.waw.sgh.bank;

public class NegativeAmountException extends BankException{
    public NegativeAmountException(String message) {
        super(message);
    }
}
