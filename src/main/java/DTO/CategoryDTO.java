package DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;
@Data
@AllArgsConstructor
@Builder
public class CategoryDTO {
    private Long id;
    private LocalDateTime createdAt;
    private String title;
    private String description;
    private List<SubCategory> subCategory;
    private List<CardDTO> cards;
}
