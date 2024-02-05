package com.study_now.application.strategy;

import com.study_now.domain.enumaration.MessageEnum;

import java.lang.reflect.InvocationTargetException;

public class Translator {

    public static String toMessage(MessageEnum message, String entityName){
        return entityName + " " + message.name();
    }

    public static String toMessage(Class<?> clazz) {
        try {
            return clazz.getDeclaredConstructor().newInstance().toString();
        } catch (IllegalArgumentException | InstantiationException | IllegalAccessException | InvocationTargetException
                 | NoSuchMethodException | SecurityException e) {
            throw new RuntimeException("");
        }
    }
}
