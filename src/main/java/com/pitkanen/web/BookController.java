package com.pitkanen.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class BookController{
	
	@RequestMapping("/index")
	public String index(){
		
		return "Bookstore index";
		
	}
}
