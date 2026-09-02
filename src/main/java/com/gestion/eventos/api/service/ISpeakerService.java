package com.gestion.eventos.api.service;

import java.util.List;

import com.gestion.eventos.api.domain.Speaker;
import com.gestion.eventos.api.dto.SpeakerRequestDto;

public interface ISpeakerService {
    Speaker save(SpeakerRequestDto requestDto);
    Speaker findById(Long id);
    List<Speaker> findAll();
    Speaker update(Long id, SpeakerRequestDto requestDto);
    void delteById(Long id); 
}
