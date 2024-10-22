package homework_27.proect.book;

public class BookImpl implements BookInterface{
    private Book[] libraries = new Book[3];
    private int count = 0;


    @Override
    public boolean addBook(Book book) {
        if (book == null) return false;
        if (count == libraries.length) return false;

        libraries[count] = book; //Book add
        count++;
        return false;
    }

    @Override
    public Book findBook(String id) {
        for (int i = 0; i < count; i++) {
            if (libraries[i].getId().equals(id))
            return libraries[i];
        }
        return null;
    }

    @Override
    public void update(Book book) {
        for (int i = 0; i < count; i++) {
           if (libraries[i].getId().equals(book.getId())){
               libraries[i] = book;//обновляем кнгу в масиве
           }
        }

    }

    @Override
    public void delete(String id) {
        for (int i = 0; i < count; i++) {
            if (libraries[i].getId().equals(id)){
                libraries[i] = libraries[count -1];//замена книги последней книгой
                libraries[count -1] = null;//удаляем последнюю книгу
                count--;//уменьшаем size
            }
        }

    }

}
