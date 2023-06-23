package DTO;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Builder
@Data
public class TaskDto {
    private Long id;
    private String name;
    private String description;
}
