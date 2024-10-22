package classwork_23.book_library.test;

import classwork_23.book_library.controller.Library;
import classwork_23.book_library.model.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;




class BookTest {

    Library library;

    Book[] books;
    int size = 0;

    @BeforeEach
    void setUp() {

        library = new Library(5);

        books = new Book[5];

        books[0] = new Book("1984", "Oruell", 1_111_111_111_110L, 2010);
        books[1] = new Book("T1", "A1", 1_111_111_111_111L, 2011);
        books[2] = new Book("T2", "A2", 1_111_111_111_112L, 2009);
        books[3] = new Book("T3", "A3", 1_111_111_111_113L, 2005);

        // TODO
        //положить объекты в массив, который "внутри" объекта library
        for (int i = 0; i < books.length - 1; i++) { // пока только 4 книги (size = 4) "кладем" в library
            library.addBook(books[i]);
        }

    }

    // method addBook : boolean (true, false)

    @Test
    void addBookTest(){
        // - не добавлять null
        assertFalse(library.addBook(null));
        //  - не добавлять дубликат
        assertFalse(library.addBook(books[2]));
        // добавляем еще одну новую
        Book newBook = new Book("T4", "A4", 1_111_111_111_114L, 2024);
        assertTrue(library.addBook(newBook));
        assertEquals(5, library.size());
        // добавляем еще одну сверх capacity
        Book oneMoreBook = new Book("T5", "A5", 1_111_111_111_115L, 2024);
        assertFalse(library.addBook(oneMoreBook));

    }

    @Test
    void findBookTest(){
        Book foundBook = library.findBook(1_111_111_111_110L);
        assertEquals( books[0], library.findBook(1_111_111_111_110L)); // find existed book
        assertNull(library.findBook(1_111_111_111_119L)); // find absent book
        //
    }

    @Test
    void removeBookTest(){
        // remove existed book
        assertEquals(books[0], library.removeBook(1_111_111_111_110L));
        assertEquals( 3, library.size());
        // remove absent book
        assertNull(library.removeBook(1_111_111_111_119L));
    }


    @Test
    void sizeTest(){
        assertEquals(4, library.size());
    }

    @Test
    void printBooksTest(){
        System.out.println("=========================");
        library.printBooks();
    }


    @Test
    void updateBookTest(){
        Book newBook = new Book("New book", "Super Puper", 1_111_111_111_114L, 2025);
        library.addBook(newBook);
        // library.update

    }

}


//class BookTest {
//
//    Book library;
//
//    Book[] books;
//    int size = 0;
//
//
//
//    @BeforeEach
//    void setUp() {
//        library = new Book(5);
//        books = new Book[5];
//
//        books[0] = new Book("1984","Oruell", 1_111_111_111_110L,2010);
//        books[1] = new Book("T1","A1", 1_111_111_111_112L,2011);
//        books[2] = new Book("T2","A2", 1_111_111_111_113L,2012);
//        books[3] = new Book("T3","A3", 1_111_111_111_114L,2013);
//
//          //TODO     ложить объекты в массив который внутри объекта library
//        for (int i = 0; i < 4; i++) {//пока еще 4 книги size = 4
////            library.addBook
//
//        }
//    }
//    //method addBook - boolean
//    @Test
//    void addBookTest(){
//        assertFalse (library.addBook(null));
//        assertFalse(library.addBook(books[0]));
//        Book newBook = new Book("T4","A4",1_111_111_111_111L, 2023);
//        assertTrue(library.addBook(newBook));
//        assertEquals(5, library.size());
//        Book oneMoreBook = new Book("T5","A5",1_111_111_111_116L, 2023);
//        assertFalse(library.addBook(oneMoreBook));
//
//
//    }
//    @Test
//    void testFindBook(){
//        Book foundBook = library.findBook(1_111_111_111_110L);
//        assertEquals(books[0], library.findBook(1_111_111_111_110L));// find existed book
//        assertNull(library.findBook(1_111_111_111_117L));// find absent book
//    }
//
//    @Test
//    void updateBookTest(){
//        Book newBook = new Book("T5","A3", 1_111_111_111_115L,2012);
//        library.addBook(newBook);
//        //library.update
//
//    }
//
//    @Test
//    void removeBookTest(){
//       assertEquals(books[0],library.removeBook(1_111_111_111_110L));
//       assertEquals(3,library.size());
//       //remove absent book
//        assertNull(library.removeBook(1_111_111_111_117L));
//
//    }
//@Test
//    void sizeTest(){
//        assertEquals(4, library.size());
//
//}
//@Test
//    void printBookTest(){
//    System.out.println("===================");
//    library.printBooks();
//}
//
//
//
//}