package jp.co.ohshiro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import jp.co.ohshiro.domain.ToDo;
import jp.co.ohshiro.service.ToDoService;

@Controller
public class MyBatisController {
	
	@Autowired
	ToDoService todoService;
	
	@GetMapping("/")
	public String index(@ModelAttribute("todoForm") ToDo todo) {
	    return "index";
	}

	@PostMapping("/todo/insert")
	public String todoInsert(ToDo todo) {
		todoService.insert(todo);
		return "index";
	}
}
