package homework_27.proect.book;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BookImplTest {
    Book[] libraries;


    @BeforeEach
    void setUp() {
        libraries = new Book[3];
        libraries[0] = new Book(1324,"A1","T1");
        libraries[1] = new Book(13245,"A2","T2");
    }

    @Test
    void addBook() {
        Book newBook = new Book(123456,"A3","T3");


    }

    @Test
    void findBook() {


    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }
}