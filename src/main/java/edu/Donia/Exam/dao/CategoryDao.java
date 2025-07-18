package edu.Donia.Exam.dao;

import edu.Donia.Exam.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryDao extends JpaRepository<Category, Integer> {
    
    boolean existsByNom(String nom);
} 