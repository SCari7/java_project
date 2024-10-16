package homework_24;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArchiveTest {
    Archive archive;
    Document[] documents;

    @BeforeEach
    void setUp() {
        archive = new Archive(5);
        documents = new Document[5];

        documents[0] = new Document("Doc1", "12.12.2021", 1_111_111_111L);
        documents[1] = new Document("Doc2", "12.12.2023", 1_111_111_112L);
        documents[2] = new Document("Doc3", "12.12.2022", 1_111_111_113L);
        documents[3] = new Document("Dok4", "12.12.2020", 1_111_111_114L);

        for (int i = 0; i < documents.length - 1; i++) {
            archive.addDocument(documents[i]);
        }
    }

    @Test
    void addDocument() {
        Document newDocument = new Document("Doc5","12.05.24",1_111_111_115L);
        assertTrue(archive.addDocument(newDocument));
        assertFalse(archive.addDocument(null));
        assertFalse(archive.addDocument(documents[4]));
        assertEquals(5,archive.getSize());
        //add 6 document
        Document newDoc = new Document("Doc6","11.12.2024", 1_111_111_115L);
        assertFalse(archive.addDocument(newDoc));


    }

    @Test
    void findDocument() {
        assertEquals(documents[0], archive.findDocument(1_111_111_111L));
        assertNull(archive.findDocument(1_111_111_119L));
    }

    @Test
    void removeDocument() {
        assertEquals(documents[1], archive.removeDocument(1_111_111_112L));
        assertEquals(3, archive.getSize());
        assertNull(archive.removeDocument(1_111_111_119L));
    }


    @Test
    void printDocuments() {
        archive.printDocuments();
    }
}