package com.ufukucar._001_kutuphaneKitapTakip;

import java.util.List;
import java.util.Scanner;

public class LibraryManager {

    public static Scanner scanner = new Scanner(System.in);

    public static void printText() {

        System.out.println("" + "--- KÜTÜPHANE SİSTEMİNE HOŞ GELDİNİZ ---\n" + "1. Kitap Ekle\n" + "2. Kitap Sil (ISBN ile)\n" + "3. Kitap Ara (Yazar veya Ad ile)\n" + "4. Tüm Kitapları Listele\n" + "5. Çıkış" + "");
        System.out.println("\nBir seçim yapınız: ");
    }


    public static void main(String[] args) {

        Library library = new Library();

        byte secim;
        boolean flag = true;

        while (flag) {

            printText();

            secim = scanner.nextByte();

            System.out.println("Seçiminiz: " + secim);

            switch (secim) {
                case 1:
                    addNewBook(library);
                    break;
                case 2:
                    deleteBook(library);
                    break;
                case 3:
                    searchBook(library);
                    break;
                case 4:
                    listBook(library);
                    break;
                case 5:
                    System.out.println("Çıkış yapılıyor.....");
                    flag = false;
                    break;
            }
            System.out.println("----------------------------------------------------------------");


        }
    }

    public static void addNewBook(Library library) {
        scanner.nextLine();
        System.out.print("Kitap adı: ");
        String title = scanner.nextLine();

        System.out.print("Yazar: ");
        String author = scanner.nextLine();


        System.out.print("Yıl: ");
        int year = scanner.nextInt();
        scanner.nextLine();

        System.out.print("ISBN no: ");
        String ISBN = scanner.nextLine();


        boolean result = library.addBook(new Book(title, author, year, ISBN));

        if (result) {
            System.out.println("Kitap başarıyla eklendi!");
        } else {
            System.out.println("Bir sorun oluştu...!");
        }
    }

    public static void deleteBook(Library library) {
        System.out.println("Lütfen silmek istediğiniz kitabın ISBN yazınız: ");

        String isbn = scanner.next();
        if (library.removeBook(isbn)) {
            System.out.println(isbn + " ISBN numaralı kitap başarıyla silinmiştir..");
        } else {
            System.out.println(isbn + " ISBN numrasına ait kitap bulunamamıştır... :(");
        }

    }

    public static void searchBook(Library library) {
        scanner.nextLine();

        System.out.println("Lütfen aramak istediğiniz kitabın adını ya da yazarını yazınız: ");
        String keyword = scanner.nextLine();

        System.out.println(keyword + " aranıyor............. \n");

        List<Book> _books = library.searchBook2(keyword);

        if (!_books.isEmpty()) {
            System.out.println("Aradığınız kitap aşağıdaki listeden biri olabilir mi? \n");

            for (Book book : _books) {
                System.out.println(book);
            }
        } else {
            System.out.println("Aradığınız kitap bulunamamıştır...");
        }

    }

    public static void listBook(Library library) {

        System.out.println("Kütüphanemizde bulunan tüm kitaplar aşağıda gösterilmektedir.");

        for (Book book : library.getBooks()) {
            System.out.println(book);
        }


    }

}
