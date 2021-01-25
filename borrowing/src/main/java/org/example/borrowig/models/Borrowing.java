package org.example.borrowig.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Borrowing {

    @Id
    private String borrowingId;

    private String inizio;
    private String fine;
    private String bookId;
}
