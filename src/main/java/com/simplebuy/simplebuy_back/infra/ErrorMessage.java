package com.simplebuy.simplebuy_back.infra;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class ErrorMessage {
    private int status;
    private String message;
    private LocalDateTime timestamp;
}
