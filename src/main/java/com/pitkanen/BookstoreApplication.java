package com.pitkanen;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.pitkanen.domain.Book;
import com.pitkanen.domain.User;
import com.pitkanen.service.BookRepository;
import com.pitkanen.service.UserRepository;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(BookRepository repository, UserRepository bookRepo){
		
		User user1 = new User("user", "$2a$06$3jYRJrg0ghaaypjZ/.g4SethoeA51ph3UD4kZi9oPkeMTpjKU5uo6", "USER");
		User user2 = new User("admin", "$2a$10$0MMwY.IQqpsVc1jC8u7IJ.2rT8b0Cd3b3sfIBGV2zfgnPGtT4r0.C", "ADMIN");
		
		return (args) -> {
			
			repository.save(new Book("Viimeinen toivomus", "Andrzej Sapkowski", 1993, "978-951-0-36569-4"));
			repository.save(new Book("6/12", "Ilkka Remes", 2006, "978-951-0-32050-1"));
			repository.save(new Book("Lohikäärmetanssi", "George R. R. Martin", 2014, "978-952-5802-09-2"));
			
			bookRepo.save(user1);
			bookRepo.save(user2);
		};
	}
}
