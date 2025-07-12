package com.simplebuy.simplebuy_back.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record UserDTO(@NotBlank String name, @NotBlank @Email String email) {}
