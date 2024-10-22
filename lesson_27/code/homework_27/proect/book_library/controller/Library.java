package homework_27.proect.book_library.controller;


import homework_27.proect.book_library.BookInterface;
import homework_27.proect.book_library.model.Book;

public class Library implements BookInterface {

    // fields
    private static Book[] books;
    private static int size; // текущее кол-во книг

    // constructor
    public Library(int capacity) {
        this.books = new Book[capacity];
        this.size = 0;
    }

    // CRUD methods
    public boolean addBook(Book book){
        // negative cases
        if(book == null){
            return false;
        }
        if(size == books.length){
            return false;
        }
        if (!(findBook(book.getIsbn()) == null)) {
            return false;
        }
        // positive case
        books[size] = book; // ставим книгу в конец массива, первое свободное место
        size++;
        return true;
    }

    // void printBooks()
    public static void printBooks() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }

    // find by author
    public Book findByAuthor(String author){
        for (int i = 0; i < size; i++) {
            if(books[i].getAuthor().equals(author)){
                return books[i];
            }
        }
        return null;
    }


    public Book findBook(long isbn){
        for (int i = 0; i < size; i++) {
            if(books[i].getIsbn() == isbn){
                return books[i];
            }
        }
        return null;
    }

    public Book removeBook(long isbn){
        for (int i = 0; i < size; i++) {
            if(books[i].getIsbn() == isbn){
                Book victim = books[i];
                books[i] = books[size - 1];// last book put instead victim
                books[size - 1] = null;// затираем последний элемент массива
                size--;
                return victim;
            }
        }
        return null;
    }

    // boolean updateBook()

    public int size(){
        return size;
    }

    @Override
    public boolean create(homework_27.proect.book.Library library) {
        return false;
    }

    @Override
    public homework_27.proect.book.Library read(String id) {
        return null;
    }

    @Override
    public void update(homework_27.proect.book.Library library) {

    }

    @Override
    public void delete(String id) {

    }
}
//public class Library {
//    //fields
//    private Library[] books;
//    private int size;// текущее кол. во книг в библиотеке
//
//
//    //constructor
//    public Library(int capacity) {
//        this.books = new Library[capacity];// длина массива
//        this.size = 0;//пока еще ни одного объекта
//    }
//
//
//    //CRUD METHODS!!!!!!!!!!!!
//    // boolean addBook (Library book)
//    public boolean addBook(Library book) {
//        if (book == null){
//            return false;
//        }
//        if (size == books.length){
//            return false;
//        }
//        if (!(findBook(book.getIsbn()) == 0)){
//            return false;
//        }
//        books[size] = book;
//        size++;
//
//        return true;
//    }
//    //size ++;
//    public int size(){
//        return size;
//    }
//
//    //void printBooks- !!!infos method!
//    public static void printBooks(){
//        for (int i = 0; i < size; i++) {
//            System.out.println(books[i]);
//        }
//    }
//
//
//    //Library findBook(long isbn)
//    public Library findBook(long isbn) {
//        for (int i = 0; i < size; i++) {
//            if (books[i].getIsbn() == isbn){
//                return books[i];
//            }
//        }
//
//
//        return null;
//    }
//
//
//
//
//    //Library removeBook (long isbn)
//    public Library removeBook(long isbn){
////        Library book = new Library();
//        for (int i = 0; i < size; i++) {
//            if ((books[i].getIsbn() == isbn)){
//                Library victim = books[i];
//                books[i] = books[size-1];
//                books[size -1] = null;
//                //last book put instead victim
//                size--;
//                return victim;
//            }
//
//        }
//        return null;
//    }
//    //size--;
//
//    //boolean updateBook()
//
//
//
//}
