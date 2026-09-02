package com.gestion.eventos.api.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.eventos.api.domain.Category;
import com.gestion.eventos.api.mapper.CategoryMapper;
import com.gestion.eventos.api.service.CategoryService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/categories")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;
    private final CategoryMapper categoryMapper;

    // @GetMapping
    // public ResponseEntity<List<Category>> getAllCategories() {
    //     return ;
    // }
}
