package edu.Donia.Exam.dao;

import edu.Donia.Exam.model.Priority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriorityDao extends JpaRepository<Priority, Integer> {
    
    boolean existsByNom(String nom);
} 