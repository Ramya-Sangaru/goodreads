package com.example.goodreads.controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;

import com.example.goodreads.service.BookH2Service;
import com.example.goodreads.model.Book;



@RestController
public class BookController {

   @Autowired
   public BookH2Service bookService;

   @GetMapping("/books")
   public ArrayList<Book> getBooks(){
     return bookService.getBooks();
   }

    @GetMapping("/books/{id}")
    public Book getBookById(@PathVariable("id") int id) {
        return bookService.getBookById(id);
    }

    @PostMapping("/books")
    public Book addBook(@RequestBody Book book) {
        return bookService.addBook(book);
    } 

    @PutMapping("/books/{id}")
    public Book updateBook(@PathVariable("id") int id, @RequestBody Book book) {
        return bookService.updateBook(id, book);
    }  

    @DeleteMapping("/books/{id}")
    public void deleteBook(@PathVariable("id") int id){
        bookService.deleteBook(id);
    }

}