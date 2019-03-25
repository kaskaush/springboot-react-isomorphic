package com.kaushik.springbootreactisomorphic.springbootreactisomorphicpoc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kaushik.springbootreactisomorphic.springbootreactisomorphicpoc.dto.TodoDTO;
import com.kaushik.springbootreactisomorphic.springbootreactisomorphicpoc.services.TodoService;

@RestController
@RequestMapping("/api")
public class TodoController {

	@Autowired
	private TodoService todoService;

	@GetMapping("/getAll")
	@ResponseBody
	public ResponseEntity<List<TodoDTO>> getAllTodos() {
		return new ResponseEntity<>(todoService.getAllTodos(), HttpStatus.OK);

	}

	@PostMapping("/insertTodo")
	public ResponseEntity<String> insertTodo(@RequestBody TodoDTO newTodo) {
		if (todoService.insertTodo(newTodo)) {
			return new ResponseEntity<>(HttpStatus.CREATED);
		} else {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
