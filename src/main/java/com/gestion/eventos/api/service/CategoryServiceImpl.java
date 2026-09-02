package com.gestion.eventos.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.gestion.eventos.api.domain.Category;
import com.gestion.eventos.api.exception.ResourceNotFoundException;
import com.gestion.eventos.api.repository.CategoryRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Optional<Category> findById(Long id) {
        return Optional.ofNullable(categoryRepository.findById(id).orElseThrow(
            () -> new ResourceNotFoundException("Categoria no encontrada con id: " + id)
        ));
    }

    @Override
    public Category save(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category update(Long id, Category category) {
        Category existingCategory = categoryRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Categoria no encontrada con ID: " + id));
        
        existingCategory.setName(category.getName());
        existingCategory.setDescription(category.getDescription());

        return categoryRepository.save(existingCategory);
    }

    @Override
    public void deleteById(Long id) {
        this.categoryRepository.deleteById(id);
    }

}
