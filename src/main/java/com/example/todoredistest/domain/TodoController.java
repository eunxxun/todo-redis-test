package com.example.todoredistest.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    // 모든 Todo 반환
    @GetMapping("/")
    public List<Todo> getAllTodos(){
        return todoService.findAll();
    }

    // 새로운 Todo 작성
    @PostMapping("/")
    public void addTodo(@RequestBody Todo todo){
        todoService.save(todo);
    }
}
