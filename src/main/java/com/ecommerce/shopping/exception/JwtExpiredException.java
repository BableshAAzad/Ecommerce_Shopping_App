package com.ecommerce.shopping.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class JwtExpiredException extends RuntimeException{
    private String message;
}
