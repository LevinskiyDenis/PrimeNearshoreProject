package org.primenearshore.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * The class is used to hide unnecessary information including inherited fields from {@link Throwable} that might be serialized
 * when returning {@link CommonParametrizedException}.
 */

@Data
@AllArgsConstructor
public class CommonExceptionResponseBody {

    private int status;
    private String message;

}
