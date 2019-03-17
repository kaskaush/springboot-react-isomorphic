package com.kaushik.springbootreactisomorphic.springbootreactisomorphicpoc.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kaushik.springbootreactisomorphic.springbootreactisomorphicpoc.entities.TodoEntity;

public interface TodoRepository extends JpaRepository<TodoEntity, Long> {

	public List<TodoEntity> findAll();

}
