package it.unical.demacs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AlgorithmTest {

    private Algorithms algo;

    @BeforeEach
    public void setUp() {
         algo = new Algorithms();
    }

    @Test
    public void insertNullString(){
        assertThrows(IllegalArgumentException.class, () -> {
            algo.isPalindrome(null);
        });
    }

    @Test
    public void insertInvalidLenghtString(){
        assertTrue(algo.isPalindrome(""));
        assertTrue(algo.isPalindrome("a"));
    }

    @Test
    public void insertValidPalindromeString(){
        assertTrue(algo.isPalindrome("A man, a plan, a canal: Panama"));
        assertTrue(algo.isPalindrome("No 'x' in Nixon"));
    }

    @Test
    public void insertValidNonPalindromeString(){
        assertFalse(algo.isPalindrome("hello"));
        assertFalse(algo.isPalindrome("This is not a palindrome"));
    }

    @Test
    public void binarySearchTest(){
        int[] numbers = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};

        assertEquals(0, algo.binarySearch(numbers, 1));
        assertEquals(4, algo.binarySearch(numbers, 9));
        assertEquals(9, algo.binarySearch(numbers, 19));
        assertEquals(-1, algo.binarySearch(numbers, 2));
        assertEquals(-1, algo.binarySearch(numbers, 20));
    }

    @Test
    public void binarySearchEmptyArrayTest(){
        int[] numbers = {};

        assertEquals(-1, algo.binarySearch(numbers, 1));
    }

    @Test
    public void binarySearchSingleElementArrayTest(){
        int[] numbers = {5};

        assertEquals(0, algo.binarySearch(numbers, 5));
        assertEquals(-1, algo.binarySearch(numbers, 3));
    }


}
