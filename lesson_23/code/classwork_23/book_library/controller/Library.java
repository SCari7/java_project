package classwork_23.book_library.controller;


import classwork_23.book_library.model.Book;

public class Library {

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

}
//public class Library {
//    //fields
//    private Book[] books;
//    private int size;// текущее кол. во книг в библиотеке
//
//
//    //constructor
//    public Library(int capacity) {
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
