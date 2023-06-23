package DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
@Data
@AllArgsConstructor
@Builder
public class SubCategory {
    private Long id;
    private LocalDateTime createdAt;
    private String title;
    private String description;
private String category;
private List<CardDTO> cards;
}
