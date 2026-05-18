package comp.test;
import org.junit.jupiter.api.Test;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import static org.junit.jupiter.api.Assertions.*;

public class Task1 {

    private static final String EMAIL_REGEX =
            "^[A-Za-z0-9.+_-]+@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*\\.[A-Za-z]{2,}$";

    private boolean isValidEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    @Test
    void testValidEmailAddresses() {
        assertTrue(isValidEmail("test@example.com"));
        assertTrue(isValidEmail("test@stu.vistula.edu.pl"));
    }

    @Test
    void testInvalidEmailAddresses() {
        assertFalse(isValidEmail("test@examplecom"));
        assertFalse(isValidEmail("test@vistula..pl"));
    }
}