package homework_27.proect.book;

public interface BookInterface {
    //CRUD Method
     boolean addBook(Book book);
     Book findBook(String id);
     void update(Book book);
     void delete(String id);

}
