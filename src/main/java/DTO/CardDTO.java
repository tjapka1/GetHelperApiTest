package DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@Builder
public class CardDTO {
    private Long id;
    private LocalDateTime createdAt;
    private UserDto user;
    private CategoryDTO category;
    private SubCategory subcategory;
    private Double price;
    private String description;
    private Boolean isActive;
}
