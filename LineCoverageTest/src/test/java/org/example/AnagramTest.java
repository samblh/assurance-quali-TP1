package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.example.Anagram.isAnagram;

public class AnagramTest {
    @Test
    public void isAnagramshouldreturnTrueIfTheInputIsanagram() {
     Assertions.assertTrue(isAnagram("listen", "silent"));
    }
    @Test
    public void isAnagramshouldreturnFalseIfTheInputIsNotanagram(){
        Assertions.assertFalse(isAnagram("hello", "world"));
    }
    @Test
    public void isAnagramshouldreturnFalseIfTheInputsAreNotequaleInlenght() {
        Assertions.assertFalse(isAnagram("hellom", "world"));
    }
    @Test

    public void IsPalindrommeShouldReturnExeptionIfTheInputsArenull()
    {
        Assertions.assertThrows(NullPointerException.class,() ->isAnagram(null, null));
    }

}
