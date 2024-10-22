package homework_27.proect.book;

public interface BookInterface {
    //CRUD Method
     boolean addBook(Library library);
     Library findBook(String id);
     void update(Library library);
     void delete(String id);

}
