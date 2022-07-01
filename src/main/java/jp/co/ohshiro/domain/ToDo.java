package jp.co.ohshiro.domain;

import lombok.Data;

@Data
public class ToDo {
    private Long todoId;
    private String todoTitle;
    private String finished;
    private String date;
    
    public ToDo(Long id, String title, String finished, String date){
    	this.todoId = id;
    	this.todoTitle = title;
    	this.finished = finished;
    	this.date = date;
    }
}
	
	
