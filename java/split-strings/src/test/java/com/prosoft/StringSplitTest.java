package com.prosoft;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Methods testing the StringSplit class")
class StringSplitTest {

    @Test
    @DisplayName("'abc' =>  ['ab', 'c_']")
    void solution() {
        assertEquals(Arrays.toString(new String[] {"ab", "c_"}), Arrays.toString(StringSplit.solution("abc")));
    }

    @Test
    @DisplayName("'abcdef' => ['ab', 'cd', 'ef']")
    void solution2() {
        assertEquals(Arrays.toString(new String[] {"ab", "cd", "ef"}), Arrays.toString(StringSplit.solution("abcdef")));
    }

}