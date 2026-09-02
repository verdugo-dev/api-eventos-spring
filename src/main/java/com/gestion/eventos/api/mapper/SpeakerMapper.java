package com.gestion.eventos.api.mapper;

import com.gestion.eventos.api.domain.Speaker;
import com.gestion.eventos.api.dto.SpeakerDto;

public interface SpeakerMapper {
    SpeakerDto toDto(Speaker speaker);
    Speaker toEntity(SpeakerDto speakerDto);
}
