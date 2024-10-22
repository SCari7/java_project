package homework_27.proect.book;

public class BookImpl implements BookInterface{
    private Library[] libraries = new Library[3];
    private int count = 0;


    @Override
    public boolean addBook(Library library) {
        if (library == null) return false;
        if (count == libraries.length) return false;

        libraries[count] = library; //Library add
        count++;
        return false;
    }

    @Override
    public Library findBook(String id) {
        for (int i = 0; i < count; i++) {
            if (libraries[i].getId().equals(id))
            return libraries[i];
        }
        return null;
    }

    @Override
    public void update(Library library) {
        for (int i = 0; i < count; i++) {
           if (libraries[i].getId().equals(library.getId())){
               libraries[i] = library;//обновляем кнгу в масиве
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
