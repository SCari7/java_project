package classwork_21.user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    User user;
    final String email = "peter@mail.de";
    final String password = "Password1.";


    @BeforeEach
    void setUp() {
        user = new User(email, password); // create new user fresh object

    }

    @Test
    void testValidEmail() {
        user.setEmail(email);
        assertEquals("peter@mail.de", user.getEmail());
    }

    @Test
    void setEmail() {
        String email = "petermail.de";
        user.setEmail(email);
        assertEquals("peter@mail.de", user.getEmail());// email didnt change
    }

    @Test
    void testWithoutDotSymbol() {
        String email = "peter@mailde";// not symbol '.'
        user.setEmail(email);
        assertEquals("peter@mail.de", user.getEmail());
    }

    @Test
    void testWithoutTwoAtSymbol() {
        String email = "peter@@mail.de"; //two symbol @@
        user.setEmail(email);
        assertEquals("peter@mail.de", user.getEmail());
    }

    @Test
    void testNotValidSymbol() {
        String email = "peter@ma!il.de"; //not valid symbol '!'
        user.setEmail(email);
        assertEquals("peter@mail.de", user.getEmail());
    }

    @Test
    void withSpase() {
        String email = "peter@ mail.de"; //not valid symbol 'space'
        user.setEmail(email);
        assertEquals("peter@mail.de", user.getEmail());
    }


    @Test
    void setPassword() {
    }
}