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
			
			repository.save(new Book("Viimeinen toivomus", "Andrzej Sapkowski", 1993, "978-951-0-36569-4"));
			repository.save(new Book("6/12", "Ilkka Remes", 2006, "978-951-0-32050-1"));
			repository.save(new Book("Lohikäärmetanssi", "George R. R. Martin", 2014, "978-952-5802-09-2"));
		};
	}
}
