package classwork_23.book_library;

import classwork_23.book_library.controller.Library;
import classwork_23.book_library.model.Book;

public class LibraryAppl {
    public static void main(String[] args) {
        Book[] books = new Book[6];
        books[0] = new Book("1984","Oruell", 1_111_111_111_110L,2010);
        books[1] = new Book("T1","A1", 1_111_111_111_112L,2011);
        books[2] = new Book("T2","A2", 1_111_111_111_113L,2012);
        books[3] = new Book("T3","A3", 1_111_111_111_114L,2013);

        Library library = new Library(4);
        for (int i = 0; i < 4; i++) { //books.length -2
            library.addBook(books[i]);

        }
        Library.printBooks();
        System.out.println(library.size());



        Book newBook = new Book("New Book", "New Book",1_111_111_111_115L, 2024);
        library.addBook(newBook);
        System.out.println("===================");

        Library.printBooks();
        System.out.println(library.size());

        library.removeBook(1_111_111_111_112L);
        System.out.println("====================");

        Library.printBooks();
        System.out.println(library.size());


    }
}
