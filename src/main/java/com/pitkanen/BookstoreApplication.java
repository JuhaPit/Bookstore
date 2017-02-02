package com.pitkanen;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.pitkanen.domain.Book;

import com.pitkanen.service.BookRepository;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(BookRepository repository){
		
		return (args) -> {
			
			repository.save(new Book("Title", "Author", 2017, "ISBN"));
		};
	}
}
