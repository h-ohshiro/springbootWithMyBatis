package jp.co.ohshiro.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import jp.co.ohshiro.domain.ToDo;

@Mapper
public interface ToDoRepository {

	void insert(ToDo todo);
	
	ToDo select(Long todoId);
	
	List<ToDo> selectAll();
	
	void update(ToDo todo);
	
	void delete(Long id);

}