package com.example.demo.model.dto;

import lombok.Data;

@Data
public class TodoDTO {
    private Long id;

    private String description;

    private String details;

    private boolean done;
}
