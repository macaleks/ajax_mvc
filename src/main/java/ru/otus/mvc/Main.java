package ru.otus.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ru.otus.mvc.model.Book;
import ru.otus.mvc.service.BookService;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class Main {

    @SuppressWarnings("SpringJavaAutowiredFieldsWarningInspection")
    @Autowired
    private BookService service;

    public static void main(String[] args) {
        SpringApplication.run(Main.class);
    }

}
