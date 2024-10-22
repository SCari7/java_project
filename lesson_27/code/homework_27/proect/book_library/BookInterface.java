package homework_27.proect.book_library;

import homework_27.proect.book.Library;

public interface BookInterface {
    //CRUD Method
    boolean create(Library library);
    Library read(String id);
    void update(Library library);
    void delete(String id);
}
