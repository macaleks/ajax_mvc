package ru.otus.mvc.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.otus.mvc.model.Book;
import ru.otus.mvc.service.BookService;

import java.util.List;

@RestController
public class BookRestController {

    private final BookService bookService;

    @Autowired
    public BookRestController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/api/books")
    public List<Book> mainPage() {
        return bookService.findAll();
    }
}
