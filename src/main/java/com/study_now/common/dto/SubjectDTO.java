package com.study_now.common.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record SubjectDTO(
        Long id,
        @NotNull @NotBlank
        String name
) {
}
