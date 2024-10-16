package homework_24;

public class Archive {
    private Document[] documents;
    private int size;

    public Archive(int capacity){
        this.documents= new Document[capacity];
        this.size = 0;
    }
    public boolean addDocument(Document document){
        // Проверка на негативные случаи
        //Эта проверка определяет, заполнен ли массив documents.
        // Если текущее количество документов (size) равно длине массива, это значит, что больше документов добавить нельзя.
        //В этом случае метод возвращает false.
        //Эта строка проверяет, существует ли уже документ с таким же идентификатором в массиве.//
        // Метод findDocument() возвращает документ, если он найден, и null, если не найден.
        // Если документ с таким documentId уже существует,
        // метод также возвращает false.
        if (document == null) return false;
        if (size == documents.length) return false;
        if (findDocument(document.getDocumentId()) != null) return false;

        documents[size] = document;
        size++;
        return true;
    }
    public Document findDocument(long documentId){
        for (int i = 0; i < size; i++) {
            if (documents[i].getDocumentId()== documentId) {
                return documents[i];
            }
        }
        return null;
    }
    public Document removeDocument (long documentId){
        for (int i = 0; i < size; i++) {
            if (documents[i].getDocumentId() == documentId){
                Document victim = documents[i];
                documents[i] = documents[size -1];
                documents[size-1] = null;
                size--;
                return victim;
            }
        }
        return null;
    }

    public int getSize() {
        return size;
    }
    public void printDocuments(){
        for (int i = 0; i < size; i++) {
            System.out.println(documents[i]);

        }

    }

}
