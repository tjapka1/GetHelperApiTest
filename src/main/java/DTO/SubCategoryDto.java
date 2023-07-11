package DTO;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Builder
@Data
public class SubCategoryDto {

    private Long id;
    private String title;
    private String description;
    private Long categoryId;

}
