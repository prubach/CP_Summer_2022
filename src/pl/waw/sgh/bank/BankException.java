package pl.waw.sgh.bank;

public class BankException extends Exception {
    public BankException(String message) {
        // call the constructor of the super class (parent)
        super(message);
    }
}
