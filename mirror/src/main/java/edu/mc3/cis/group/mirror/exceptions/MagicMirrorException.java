package edu.mc3.cis.group.mirror.exceptions;
import org.springframework.http.HttpStatus;

/**
 * MagicMirrorException is an Exception class to be implemented to prevent the program from crashing
 * due to an unexpected event
 */
public class MagicMirrorException extends RuntimeException {

    private HttpStatus status;
    private Throwable cause;
    private String message;

    /**
     * MagicMirrorException constructor allows us to customize the message that was returned as well as the
     * HttpStatus and access the cause.
     * @param status HttpStatus that threw the error
     * @param cause Throwable allows us to access the cause
     * @param message String message to be returned to the user
     */
    public MagicMirrorException(HttpStatus status, Throwable cause,String message) {
        super(message, cause);
        this.status = status;
        this.cause = cause;
        this.message = message;
    }

    public HttpStatus getStatus() {
        return status;
    }
}
