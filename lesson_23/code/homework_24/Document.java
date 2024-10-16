package homework_24;

public class Document {
    public static final int DOCUMENT_ID_LENGTH = 10;

    private String name;
    private String data;
    private long documentId;

    public Document(String name, String data, long documentId) {
        this.name = name;
        this.data = data;
        this.documentId = documentId;
    }
    private long checkDocument(long documentId){
        if (countDigits(documentId)){
            return documentId;
        }else {
            System.out.println("Invalid Document ID.It must be exactly 10 digits");
            return 0;
        }
    }
    private boolean countDigits(long documentId){
        int count = 0;
        long temp = documentId;
        while (temp != 0){
            temp /= 10;
            count++;
        }
        return count == DOCUMENT_ID_LENGTH;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public long getDocumentId() {
        return documentId;
    }

    public void setDocumentId(long documentId) {
        this.documentId = documentId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Document{");
        sb.append("name='").append(name).append('\'');
        sb.append(", data='").append(data).append('\'');
        sb.append(", documentId=").append(documentId);
        sb.append('}');
        return sb.toString();
    }
}
