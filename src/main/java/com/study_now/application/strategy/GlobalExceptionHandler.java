package com.study_now.application.strategy;

import com.study_now.common.dto.ResponseApiDTO;
import com.study_now.domain.enumaration.MessageEnum;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ResponseApiDTO> handlerValidationError(MethodArgumentNotValidException ex){
        ResponseApiDTO response = ResponseApiDTO.builder()
                .status(HttpStatus.BAD_REQUEST.value())
                .message(MessageEnum.BAD_REQUEST.name()).build();

        return ResponseEntity.status(response.status()).body(response);
    }

}
