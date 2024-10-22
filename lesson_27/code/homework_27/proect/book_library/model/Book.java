package homework_27.proect.book_library.model;

import java.util.Objects;

public class Book {
    //constant
    public static final int ISBN_LENGTH = 13;
    //fields
    private String title;
    private String author;
    private long isbn;
    private int yearOfPublishing;


    //constructor


    public Book(String title, String author, long isbn, int yearOfPublishing) {
        this.title = title;
        this.author = author;
//        this.isbn = isbn;
//        if (isIsbnValid){
//            this.isbn = isbn;
//        }
        this.isbn = checkIsbn(isbn);

        this.yearOfPublishing = yearOfPublishing;
    }

    private long checkIsbn(long isbn) {

        //проверить длину isbn!!!
        if (countDigit(isbn)) {
            return isbn;
        }

        return -1;
    }

    public long getIsbn() {
        return isbn;
    }
//Todo предусмотреть защиту по поводу 13 цифр и в этом случае
    public void setIsbn(long isbn) {
        if (checkIsbn(isbn)> 0){
            this.isbn = checkIsbn(isbn);
        }else {
            System.out.println("ISBN  is not correct");
        }

    }

    private boolean countDigit(long isbn) {

        int count = 0;
        long temp = isbn;
        while ((temp != 0)){
            temp = temp / 10;
            count++;
        }
        return count == ISBN_LENGTH;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return isbn == book.isbn;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(isbn);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Library{");
        sb.append("title='").append(title).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append(", isbn=").append(isbn);
        sb.append(", yearOfPublishing=").append(yearOfPublishing);
        sb.append('}');
        return sb.toString();
    }
}
