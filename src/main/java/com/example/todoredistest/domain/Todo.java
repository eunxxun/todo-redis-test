package com.example.todoredistest.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Todo {

    @Id
    private Long id;

    private String title;
    private String description;
    private boolean completed = false;
}
