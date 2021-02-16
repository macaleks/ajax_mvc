package ru.otus.mvc.dao;

import org.springframework.data.repository.CrudRepository;
import ru.otus.mvc.model.Book;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Integer> {

    List<Book> findAll();

}