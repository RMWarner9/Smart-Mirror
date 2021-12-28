package edu.mc3.cis.group.mirror.exceptions.handler;
import edu.mc3.cis.group.mirror.exceptions.MagicMirrorException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * RestResponseEntityExceptionHandler is a custom exception handler that allows us to handle any events that may
 * crash the program. This handler handles exceptions from the MagicMirrorException class
 */
@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    /**
     * handleConflict method handles any issues that may be associated with the MagicMirrorException class
     * @param ex MagicMirrorException
     * @param request an interface for a web request allows us to get the requests metadata
     * @return handleExceptionInternal a way to customize the the response body of all exceptions types
     */
    @ExceptionHandler(MagicMirrorException.class)
    protected ResponseEntity<Object> handleConflict(MagicMirrorException ex, WebRequest request){
        return handleExceptionInternal(ex, ex.getMessage(), new HttpHeaders(), ex.getStatus(), request);
    }


}
