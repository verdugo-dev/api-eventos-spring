package com.gestion.eventos.api.service;

import java.util.List;

import com.gestion.eventos.api.domain.Category;

public interface CategoryService {
    List<Category> findAll();
    Category findById(Long id);
    Category save(Category category);
    Category update(Long id, Category category);
    void deleteById(Long id);
}
