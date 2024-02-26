import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.example.PalindromeCorrection.isPalindrome;
public class PalindromeTest {
    @Test
    void NullStringShouldThrowException(){
        Assertions.assertThrows(NullPointerException.class, ()->isPalindrome(null));
    }
    @Test
    void StringIsPalindrome(){
        Assertions.assertTrue(isPalindrome("radar"));
    }
    @Test
    void StringIsNotPalindrome(){
        Assertions.assertFalse(isPalindrome("oussama"));
    }
}
