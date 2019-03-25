package com.kaushik.springbootreactisomorphic.springbootreactisomorphicpoc.services;

import java.util.List;

import com.kaushik.springbootreactisomorphic.springbootreactisomorphicpoc.dto.TodoDTO;

public interface TodoService {

	boolean insertTodo(TodoDTO todoToInsert);

	List<TodoDTO> getAllTodos();

}
