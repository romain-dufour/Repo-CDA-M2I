package com.m2ibank.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class BaseResponseDto {
    // utiliser Object n'est pas ideal, le top est de typé par rapport a ce qui est attendu et de créer plusieurs dto pour chaque type attendu
    private Object message;
    private Object data;

    public BaseResponseDto(Object message) {
        this.message = message;
    }
}
