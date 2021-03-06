package com.example.demo.service;

import com.example.demo.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ICategoryService {
    Page<Category> findAll(Pageable pageable);
    List<Category> findAll();
    Category save(Category category);
    void deleteById(Long id);
    Optional<Category> findById(Long id);
    boolean existsByNameCategory(String nameCategory);
}
