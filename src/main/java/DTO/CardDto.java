package DTO;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class CardDto {
    private Long id;
    private String image;
    private ProfileDto user;
    private String title;
    private CategoryDto category;
    private SubCategoryDto subCategory;
    private Double price;
    private String description;
    private String fullDescription;
    private Boolean isActive;

}
