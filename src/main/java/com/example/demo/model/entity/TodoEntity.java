package com.example.demo.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class TodoEntity {
    @Id
    @GeneratedValue
    private Long id;

    private String description;

    private String details;

    private boolean done;
}
