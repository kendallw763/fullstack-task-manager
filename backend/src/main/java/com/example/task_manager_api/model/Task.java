package com.example.task_manager_api.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity// marked class as JPA entity mapping it to db table
@Table(name = "tasks")
@Data//Lombok annotation to generate getter, setters toString, equals, and hash code

public class Task {
    @Id //field marked as prime key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private boolean completed;
}
