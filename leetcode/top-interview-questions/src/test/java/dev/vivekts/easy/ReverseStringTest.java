package dev.vivekts.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("String reversal test")
public class ReverseStringTest {

    ReverseString reverseString;
    char[] input;

    @BeforeEach
    public void createReverseStringInstance(){
        reverseString = new ReverseString();
    }

    @Test
    public void shouldReverseACharArrayOfEvenLength(){
        input = new char[]{'H','a','n','n','a','h'};
        char[] expected = new char[]{'h','a','n','n','a','H'};
        reverseString.solve(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void shouldReverseACharArrayOfOddLength(){
        input = new char[]{'H','e','l','l','o'};
        char[] expected = new char[]{'o','l','l','e','H'};
        reverseString.solve(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void shouldReturnNullFromANullCharArray(){
        reverseString.solve(input);
        assertTrue(input == null);
    }

    @Test
    public void shouldReturnTheSameFromAZeroCharArray(){
        input = new char[0];
        char[] expected = new char[0];
        reverseString.solve(input);
        assertArrayEquals(expected,input);
    }

}
