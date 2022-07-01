package jp.co.ohshiro.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	public String index(@ModelAttribute("todoForm") ToDo todo, Model model) {
		List<ToDo> result = todoService.selectAll();
		model.addAttribute("todoList", result);
	    return "index";
	}

	@PostMapping("/todo/insert")
	public String todoInsert(ToDo todo) {

		Date date = new Date();
		String sDate = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(date);   
		todo.setDate(sDate);
		todoService.insert(todo);
		return "redirect:/";	
	}
}
