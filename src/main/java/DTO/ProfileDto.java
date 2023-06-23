package DTO;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class ProfileDto {

    private Long id;
    private String email;
    private String role;
    private Boolean isHelper;
    private List<CardDTO> cards;
}
