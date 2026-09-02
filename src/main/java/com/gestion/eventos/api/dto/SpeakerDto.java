package com.gestion.eventos.api.dto;


import com.gestion.eventos.api.domain.Category;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SpeakerDto {
    private Long id;
    private String name;
    private String email;
    private String bio;
    private Category category;
}
