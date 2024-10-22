package homework_27.proect.book;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LibraryImplTest {
    Library[] libraries;


    @BeforeEach
    void setUp() {
        libraries = new Library[3];
        libraries[0] = new Library(1324,"A1","T1");
        libraries[1] = new Library(13245,"A2","T2");
    }

    @Test
    void addBook() {
        Library newLibrary = new Library(123456,"A3","T3");


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