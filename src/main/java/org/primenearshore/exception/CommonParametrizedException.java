package org.primenearshore.exception;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.primenearshore.exception.handler.CommonExceptionHandler;
import org.springframework.http.HttpStatus;

import java.util.List;
import java.util.Map;


/**
 * This class allows flexible exception creation throughout the application,
 * eliminating the need to create numerous exception entities for each specific case.
 * However, if for any reason this class becomes unsuitable in the future,
 * we can always create a separate exception class for that particular case and handle it uniquely in a exception handler.
 */

@Builder
@Data
@EqualsAndHashCode(callSuper = true)
public class CommonParametrizedException extends RuntimeException {

    private final HttpStatus httpStatus;
    private final String message;

    // Can be used to store parameter value - parameter constraint violation message for explicit validation
    private final List<Map.Entry<String, String>> parameters;

}
