package model.exceptions;

public class AccountException extends RuntimeException {
    public AccountException(String msg) {
        super(msg);
    }
}