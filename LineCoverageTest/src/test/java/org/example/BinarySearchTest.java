package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.example.BinarySearch.binarySearch;
class BinarySearchTest {
    @Test
    void binarySearchShouldThrowsException(){
    Assertions.assertThrows(NullPointerException.class, ()->binarySearch(null, 1));
}
    @Test
    void WhenTheMiddleArrayElementEqualTheElement() {
        int[] tableauNonTrie = {5, 2, 9, 1, 3};
        Arrays.sort(tableauNonTrie);
        Assertions.assertEquals(2, binarySearch(tableauNonTrie, 3));
    }
}