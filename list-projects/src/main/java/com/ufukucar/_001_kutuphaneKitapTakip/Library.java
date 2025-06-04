package com.ufukucar._001_kutuphaneKitapTakip;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter @Setter
public class Library {

    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }


    // addBook (Book book)
    public boolean addBook(Book book) {
        return this.books.add(book);
    }

    // removeBook (String isbn)
    public boolean removeBook(String isbn) {
        boolean found = false;
        for (Book book : this.books) {
            if (book.getIsbn().equals(isbn)) {
                this.books.remove(book);
                found = true;
            }
        }

        return found;
    }

    // searchBook (String keyword)
    public List<Book> searchBook2(String keyword) {

        List<Book> _books = new ArrayList<>();
        for (Book book : this.books) {

            if ( book.getTitle().toLowerCase().contains(keyword.toLowerCase())

            || book.getAuthor().toLowerCase().contains(keyword.toLowerCase())) {

                _books.add(book);

            }
        }

        return _books;

    }


    // listBooks : void
    public List<Book> getBooks() {
        return this.books;
    }


}
