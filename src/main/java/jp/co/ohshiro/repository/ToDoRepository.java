package jp.co.ohshiro.repository;

import org.apache.ibatis.annotations.Mapper;

import jp.co.ohshiro.domain.ToDo;

@Mapper
public interface ToDoRepository {

	void insert(ToDo todo);
	
	ToDo select(Long todoId);
	
	void update(ToDo todo);
	
	void delete(Long id);

}