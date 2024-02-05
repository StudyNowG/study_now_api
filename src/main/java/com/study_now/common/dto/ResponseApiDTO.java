package com.study_now.common.dto;

import lombok.Builder;

@Builder
public record ResponseApiDTO(int status, Object message) {
}
