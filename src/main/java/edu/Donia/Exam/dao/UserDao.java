package edu.Donia.Exam.dao;

import edu.Donia.Exam.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {
    
    Optional<User> findByPseudo(String pseudo);
    
    boolean existsByPseudo(String pseudo);
}