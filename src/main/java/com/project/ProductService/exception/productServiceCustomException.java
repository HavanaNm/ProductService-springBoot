package com.project.ProductService.exception;

import lombok.Data;

@Data
public class productServiceCustomException extends RuntimeException{

    private String errorCode;

    public productServiceCustomException(String errorCode, String message){
        super(message);
        this.errorCode = errorCode;
    }
}
