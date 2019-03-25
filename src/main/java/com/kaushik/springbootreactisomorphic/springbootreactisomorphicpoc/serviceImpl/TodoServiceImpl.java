package com.kaushik.springbootreactisomorphic.springbootreactisomorphicpoc.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kaushik.springbootreactisomorphic.springbootreactisomorphicpoc.dto.TodoDTO;
import com.kaushik.springbootreactisomorphic.springbootreactisomorphicpoc.entities.TodoEntity;
import com.kaushik.springbootreactisomorphic.springbootreactisomorphicpoc.repositories.TodoRepository;
import com.kaushik.springbootreactisomorphic.springbootreactisomorphicpoc.services.TodoService;

@Service
public class TodoServiceImpl implements TodoService {

	@Autowired
	private TodoRepository todoRepo;

	@Override
	public boolean insertTodo(TodoDTO todoToInsert) {
		boolean status = false;
		TodoEntity todoEntity = new TodoEntity();
		ModelMapper mapper = new ModelMapper();
		mapper.map(todoToInsert, todoEntity);
		try {
			todoRepo.save(todoEntity);
			status = true;
		} catch (Exception e) {
			status = false;
		}

		return status;
	}

	@Override
	public List<TodoDTO> getAllTodos() {
		List<TodoEntity> allTodos = todoRepo.findAll();
		List<TodoDTO> dtos = new ArrayList<>();
		ModelMapper mapper = new ModelMapper();
		for (TodoEntity t : allTodos) {
			TodoDTO newDto = new TodoDTO();
			mapper.map(t, newDto);
			dtos.add(newDto);
		}
		return dtos;
	}

}
