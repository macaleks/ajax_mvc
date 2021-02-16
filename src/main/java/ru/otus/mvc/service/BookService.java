package ru.otus.mvc.service;

import ru.otus.mvc.model.Book;

import java.util.List;

public interface BookService {

    List<Book> findAll();
}
