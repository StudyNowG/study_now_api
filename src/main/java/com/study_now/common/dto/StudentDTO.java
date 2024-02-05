package com.study_now.common.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;

import java.time.LocalDate;

@Builder
public record StudentDTO(
        Long id,
        @NotBlank @NotNull
        String name,
        @NotBlank @NotNull
        String email,
        @NotNull
        LocalDate birthDayDate,
        @NotBlank @NotNull
        String desireCourse
) {
}
