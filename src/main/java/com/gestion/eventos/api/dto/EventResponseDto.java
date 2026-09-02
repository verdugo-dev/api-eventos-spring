package com.gestion.eventos.api.dto;

import java.time.LocalDate;
import java.util.List;

import com.gestion.eventos.api.domain.Category;

import lombok.Data;

@Data
public class EventResponseDto {
    private Long id;
    private String name;
    private LocalDate date;
    private String location;
    private Category category;
    private List<SpeakerResponseDto> speakerDtos;
}
