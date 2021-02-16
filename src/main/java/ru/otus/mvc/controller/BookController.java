package ru.otus.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import ru.otus.mvc.rest.BookRestController;

@Controller
public class BookController {

    private final BookRestController restController;

    public BookController(BookRestController restController) {
        this.restController = restController;
    }

    @GetMapping("/")
    public String listPage() {
        return "main";
    }
}
