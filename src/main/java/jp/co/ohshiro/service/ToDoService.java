package jp.co.ohshiro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.co.ohshiro.domain.ToDo;
import jp.co.ohshiro.repository.ToDoRepository;

@Service
public class ToDoService {

	@Autowired
	ToDoRepository toDoRepository; 
	
	//SELECTを行うMapperのメソッドを呼び出す
    @Transactional
    public ToDo select(Long id) {
        return toDoRepository.select(id);
    }
  //SELECTを行うMapperのメソッドを呼び出す
    @Transactional
    public List<ToDo> selectAll() {
    	List<ToDo> todoList = toDoRepository.selectAll();
        return todoList;
    }

    //INSERTを行うMapperのメソッドを呼び出す
    @Transactional
    public void insert(ToDo todo) {
    	toDoRepository.insert(todo);
    }

    //UPDATEを行うMapperのメソッドを呼び出す
    @Transactional
    public void update(Long id, String title, String date) {
    }

    //DELETEを行うMapperのメソッドを呼び出す
    @Transactional
    public void delete(Long id) {
    	toDoRepository.delete(id);
    }
}
