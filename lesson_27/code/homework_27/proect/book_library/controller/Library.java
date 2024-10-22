package homework_27.proect.book_library.controller;


import homework_27.proect.book.Book;
import homework_27.proect.book_library.BookInterface;

public class Library implements BookInterface {

    // fields
    private static homework_27.proect.book_library.model.Book[] books;
    private static int size; // текущее кол-во книг

    // constructor
    public Library(int capacity) {
        this.books = new homework_27.proect.book_library.model.Book[capacity];
        this.size = 0;
    }

    // CRUD methods
    public boolean addBook(homework_27.proect.book_library.model.Book book){
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
    public homework_27.proect.book_library.model.Book findByAuthor(String author){
        for (int i = 0; i < size; i++) {
            if(books[i].getAuthor().equals(author)){
                return books[i];
            }
        }
        return null;
    }


    public homework_27.proect.book_library.model.Book findBook(long isbn){
        for (int i = 0; i < size; i++) {
            if(books[i].getIsbn() == isbn){
                return books[i];
            }
        }
        return null;
    }

    public homework_27.proect.book_library.model.Book removeBook(long isbn){
        for (int i = 0; i < size; i++) {
            if(books[i].getIsbn() == isbn){
                homework_27.proect.book_library.model.Book victim = books[i];
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
    public boolean create(Book book) {
        return false;
    }

    @Override
    public Book read(String id) {
        return null;
    }

    @Override
    public void update(Book book) {

    }

    @Override
    public void delete(String id) {

    }
}
//public class Book {
//    //fields
//    private Book[] books;
//    private int size;// текущее кол. во книг в библиотеке
//
//
//    //constructor
//    public Book(int capacity) {
//        this.books = new Book[capacity];// длина массива
//        this.size = 0;//пока еще ни одного объекта
//    }
//
//
//    //CRUD METHODS!!!!!!!!!!!!
//    // boolean addBook (Book book)
//    public boolean addBook(Book book) {
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
//    //Book findBook(long isbn)
//    public Book findBook(long isbn) {
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
//    //Book removeBook (long isbn)
//    public Book removeBook(long isbn){
////        Book book = new Book();
//        for (int i = 0; i < size; i++) {
//            if ((books[i].getIsbn() == isbn)){
//                Book victim = books[i];
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
