package com.example.demo.service;

import com.example.demo.model.dto.TodoDTO;
import com.example.demo.model.entity.TodoEntity;
import com.example.demo.respository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TodoService {

    private final TodoRepository todoRepository;

    public TodoEntity create(TodoDTO todo) {
        TodoEntity todoEntity = new TodoEntity();
        todoEntity.setId(todo.getId());
        todoEntity.setDescription(todo.getDescription());
        todoEntity.setDetails(todo.getDetails());
        todoEntity.setDone(todo.isDone());
        return todoRepository.save(todoEntity);
    }

    public List<TodoEntity> getAllTodoList(){
        return todoRepository.findAll();
    }
}
