package com.kaushik.springbootreactisomorphic.springbootreactisomorphicpoc.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kaushik.springbootreactisomorphic.springbootreactisomorphicpoc.entities.TodoEntity;

@Repository
public interface TodoRepository extends JpaRepository<TodoEntity, Long> {

	public List<TodoEntity> findAll();

}
