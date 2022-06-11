package jp.co.ohshiro.repository;

import jp.co.ohshiro.domain.ToDo;

public interface ToDoRepository {

	void insert(ToDo todo);
	
	ToDo select(Long todoId);
	
	void update(ToDo todo);
	
	void delete(Long id);

}