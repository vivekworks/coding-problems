package dev.vivekts.easy;

import java.util.stream.IntStream;

/**
 * <p>
 * This class reverses a string with following characteristics:
 *   <ul>
 *      <li>The input string is given as an array of characters char[].</li>
 *      <li>Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.</li>
 *      <li>You may assume all the characters consist of printable ascii characters.</li>
 *   </ul>
 *   <pre>
 *      ReverseString stringReverser = new ReverseString();
 *      stringReverser.solve(char[] s);
 *   </pre>
 * </p>
 */
public class ReverseString {

    public void solve(char[] s) {
        if(s== null || s.length <= 0)
            return;
        IntStream
                .range(0, s.length / 2)
                .forEach(n -> {
                    char temp = s[n];
                    s[n] = s[s.length - 1 - n];
                    s[s.length - 1 - n] = temp;
                });
    }
}
