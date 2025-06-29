package com.simplehrms.common;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
class ErrorResponse {
    private List<String> errors;
}
