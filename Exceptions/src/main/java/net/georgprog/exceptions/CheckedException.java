package net.georgprog.exceptions;

public class CheckedException extends Exception {

    public static final String CHECKED_EXCEPTION = "oh shit, here we go again";

    public CheckedException() {
        super(CHECKED_EXCEPTION);
    }
}
