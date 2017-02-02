package com.pitkanen.service;
import org.springframework.data.repository.CrudRepository;
import java.util.List;
import com.pitkanen.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
	
	List<Book> findByTitle(String title);
}
