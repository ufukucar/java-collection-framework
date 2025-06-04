package com.ufukucar._001_kutuphaneKitapTakip;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor

public class Book {

    private String title;
    private String author;
    private int year;
    private String isbn;


    @Override
    public String toString() {
        return "Başlık: " + this.getTitle()
                + " | " + this.getAuthor()
                + " | " + this.getYear()
                + " | " + this.getIsbn();
    }
}
