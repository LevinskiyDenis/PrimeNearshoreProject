package org.primenearshore.exception.handler;

import lombok.extern.slf4j.Slf4j;
import org.primenearshore.exception.CommonExceptionResponseBody;
import org.primenearshore.exception.CommonParametrizedException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
@Slf4j
public class CommonExceptionHandler {

    @ExceptionHandler(CommonParametrizedException.class)
    public ResponseEntity<CommonExceptionResponseBody> handleCommonParametrizedException(CommonParametrizedException ex) {
        // It is better to have more detailed log than Spring provides by default in this case
        log.error("handleCommonParametrizedException: ", ex);
        CommonExceptionResponseBody errorResponse = new CommonExceptionResponseBody(ex.getHttpStatus().value(), ex.getMessage());
        return new ResponseEntity<>(errorResponse, ex.getHttpStatus());
    }

}