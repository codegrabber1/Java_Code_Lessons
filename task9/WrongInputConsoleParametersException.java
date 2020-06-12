package task9;


/**
 * The {@code WrongInputConsoleParametersException} inherits Exception,
 * represents my own exception class.
 */
public class WrongInputConsoleParametersException extends Exception {

    private String mess;

    /**
     * Constructs a new exception with {@code null} as its detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     */
    public WrongInputConsoleParametersException(String mess) {
        super(mess);
        this.mess = mess;
    }

    public String getMess() {
        return mess;
    }
}
