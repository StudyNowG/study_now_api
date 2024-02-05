package com.study_now.mock;

import com.study_now.common.dto.StudentDTO;
import com.study_now.domain.entities.Student;

import java.time.LocalDate;
import java.util.Random;

public abstract class StudentDTOMock {
    public static StudentDTO mock(){
        return StudentDTO.builder()
                .id(new Random().nextLong())
                .name("Gustavo Anacleto")
                .email("email_generic@provider.com.br")
                .birthDayDate(LocalDate.of(2005, 5, 13))
                .desireCourse("Computer Science")
                .build();
    }
}
