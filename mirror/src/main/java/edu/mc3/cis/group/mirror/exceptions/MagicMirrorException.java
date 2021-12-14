package edu.mc3.cis.group.mirror.exceptions;

import org.springframework.http.HttpStatus;


public class MagicMirrorException extends RuntimeException {

    private HttpStatus status;
    private Throwable cause;
    private String message;

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
