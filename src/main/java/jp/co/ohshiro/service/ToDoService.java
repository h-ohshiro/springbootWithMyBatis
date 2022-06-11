package jp.co.ohshiro.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import jp.co.ohshiro.domain.ToDo;
import jp.co.ohshiro.repository.ToDoRepository;

public class ToDoService {

	@Autowired
	ToDoRepository toDoRepository; 
	
	//SELECTを行うMapperのメソッドを呼び出す
    @Transactional
    public ToDo select(Long id) {
        return toDoRepository.select(id);
    }

    //INSERTを行うMapperのメソッドを呼び出す
    @Transactional
    public void insert(Long id, String title, LocalDateTime createdAt) {
    	ToDo toDo = new ToDo(id, title, createdAt);
    	toDoRepository.insert(toDo);
    }

    //UPDATEを行うMapperのメソッドを呼び出す
    @Transactional
    public void update(Long id, String title, LocalDateTime createdAt) {
    	ToDo toDo = new ToDo(id, title, createdAt);
    	toDoRepository.update(toDo);
    }

    //DELETEを行うMapperのメソッドを呼び出す
    @Transactional
    public void delete(Long id) {
    	toDoRepository.delete(id);
    }
	
}
