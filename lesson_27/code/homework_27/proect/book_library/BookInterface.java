package homework_27.proect.book_library;

import homework_27.proect.book.Book;

public interface BookInterface {
    //CRUD Method
    boolean create(Book book);
    Book read(String id);
    void update(Book book);
    void delete(String id);
}
