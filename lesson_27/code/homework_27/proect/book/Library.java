package homework_27.proect.book;

import homework_27.proect.book_library.model.Book;

import java.util.Objects;

public class Library {
//    private static Book[] books;
//    private static int size; // текущее кол-во книг
    private int id;
    private String author;
    private String title;


    public Library(int id, String author, String title) {
        this.id = id;
        this.author = author;
        this.title = title;
    }

    public String getId() {
        return null;
    }

    public void setId(String id) {
        this.id = Integer.parseInt(id);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Library library)) return false;
        return id == library.id && Objects.equals(author, library.author) && Objects.equals(title, library.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, author, title);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Library{");
        sb.append("id=").append(id);
        sb.append(", author='").append(author).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
