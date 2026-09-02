package com.gestion.eventos.api.mapper;

import java.util.List;

import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import com.gestion.eventos.api.domain.Speaker;
import com.gestion.eventos.api.dto.SpeakerRequestDto;
import com.gestion.eventos.api.dto.SpeakerResponseDto;

public interface SpeakerMapper {
    @Mapping(target = "events", ignore = true)
    SpeakerResponseDto toDto(Speaker speaker);
    
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "events", ignore = true)
    Speaker toEntity(SpeakerRequestDto speakerDto);

    List<SpeakerResponseDto> toResponseDtoList(List<Speaker> speakers);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "events", ignore = true)
    void updateSpeakerFromDto(SpeakerRequestDto requestDto, @MappingTarget Speaker speaker);

}
