package com.example.todoredistest.domain;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    private final String TODO_LIST_KEY = "TODO_LIST";

    private final RedisTemplate redisTemplate;
    private final TodoRepository todoRepository;

    public TodoService(RedisTemplate redisTemplate, TodoRepository todoRepository) {
        this.redisTemplate = redisTemplate;
        this.todoRepository = todoRepository;
    }

    // Redis에서 모든 Todo 가져오기
    public List<Todo> findAll() {
        return redisTemplate.opsForList().range(TODO_LIST_KEY,0,-1);
    }

    // Redis와 MySQL에 새로운 Todo 추가
    public void save(Todo todo) {
        todoRepository.save(todo);
        redisTemplate.opsForList().rightPush(TODO_LIST_KEY,todo);
    }
}
