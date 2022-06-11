package jp.co.ohshiro.domain;

import java.time.LocalDateTime;

import lombok.Data;

	@Data
	public class ToDo {
	    private Long todoId;
	    private String todoTitle;
	    private boolean finished;
	    private LocalDateTime createdAt;
	    
	    public ToDo(Long id, String title, LocalDateTime createdAt){
	    	setTodoId(id);
	    	setTodoTitle(title);
	    	setFinished(false);
	    	setCreatedAt(createdAt);
	    }
	}
	
	
