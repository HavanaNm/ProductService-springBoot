package com.project.ProductService.exception;

import com.project.ProductService.model.errorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class restResponseEntityHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(productServiceCustomException.class)
    public ResponseEntity<errorResponse> handleProductServiceException(productServiceCustomException exception){
        return new ResponseEntity<>(new errorResponse().builder()
                .errorMessage(exception.getMessage())
                .errorCode(exception.getErrorCode())
                .build(), HttpStatus.NOT_FOUND);
    }
}
