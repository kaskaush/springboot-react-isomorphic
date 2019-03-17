package com.kaushik.springbootreactisomorphic.springbootreactisomorphicpoc.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kaushik.springbootreactisomorphic.springbootreactisomorphicpoc.entities.TodoEntity;
import com.kaushik.springbootreactisomorphic.springbootreactisomorphicpoc.repositories.TodoRepository;

@RestController
@RequestMapping("/api")
public class TodoController {

	private TodoRepository todoRepo;

	@GetMapping("/getAll")
	@ResponseBody
	public ResponseEntity<String> getAllTodos() {
		List<TodoEntity> todos = todoRepo.findAll();
		return new ResponseEntity<>(todos.toString(), HttpStatus.OK);

	}

}
