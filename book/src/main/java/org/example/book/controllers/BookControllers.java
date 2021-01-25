package org.example.book.controllers;

import org.example.book.models.Book;
import org.example.book.repos.BookRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v2/book")
public class BookControllers {
    @Autowired
    private BookRepos bookRepos;

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public String sayHello(@PathVariable String name){
        return "Hello "+name;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public void setBook(@RequestBody Book book){
        bookRepos.save(book);
        System.out.println(book);
    }

}