package com.example.demo.controller;

import com.example.demo.model.dto.TodoDTO;
import com.example.demo.model.entity.TodoEntity;
import com.example.demo.respository.TodoRepository;
import com.example.demo.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class TodoController {
    private final TodoService todoService;

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public TodoEntity createTodo(@RequestBody TodoDTO todoDTO) {
        return todoService.create(todoDTO);
    }

    @GetMapping("/")
    public List<TodoEntity> getTodos() {
        return todoService.getAllTodoList();
    }
}
