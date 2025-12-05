package it.unical.demacs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
}
