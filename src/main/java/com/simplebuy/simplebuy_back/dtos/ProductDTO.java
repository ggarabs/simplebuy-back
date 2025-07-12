package com.simplebuy.simplebuy_back.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ProductDTO(@NotBlank String name, @NotNull Long price, String description, @NotNull Long stock_quantity) {
}
