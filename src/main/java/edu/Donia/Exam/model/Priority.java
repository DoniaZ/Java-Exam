package edu.Donia.Exam.model;

import com.fasterxml.jackson.annotation.JsonView;
import edu.Donia.Exam.view.PriorityView;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@Entity
@Table(name = "priorities")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Priority {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonView(PriorityView.class)
    private Integer id;
    
    @NotBlank(message = "Le nom de la priorité est obligatoire")
    @Column(unique = true, nullable = false)
    @JsonView(PriorityView.class)
    private String nom;
} 