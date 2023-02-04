package com.example.lms.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.lms.entity.Book;
import com.example.lms.service.BookService;

@Controller
public class IndexController {

    private final BookService bookService;

    public IndexController(BookService bookService){
        this.bookService = bookService;
    }
    
    @GetMapping("/")
    public String findAllBooks(Model model) {
        final List<Book> books = bookService.findAllBooks();
        model.addAttribute("books", books);
        return "list-books";
    }
}
