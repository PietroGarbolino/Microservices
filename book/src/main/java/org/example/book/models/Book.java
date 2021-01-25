package org.example.book.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Book {

    @Id
    private String bookId;

    private String titolo;
    private String autore;

    public String getTitolo(){
        return titolo;
    }

    public void setTitolo(String titolo){
        this.titolo = titolo;
    }

    public String getAutore(){
        return autore;
    }

    public void setAutore(String autore){
        this.autore = autore;
    }

    public String getBookId(){
        return bookId;
    }

    public void setBookId(String bookId){
        this.bookId = bookId;
    }

    @Override
    public  String toString(){
        return this.autore + " " + this.titolo;
    }
}
