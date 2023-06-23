package DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@Builder
public class UserDto {
    private Long id;
    private String email;
    private Boolean isHelper;
    private List<CardDTO> cards;

}
