package com.prosoft;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Methods testing the Kata class:")
class KataTest {

    @Test
    @DisplayName("sumStrings('1','2') => '3'")
    void sumStringsExecutedSuccess() {
        assertEquals("3", Kata.sumStrings("1", "2"));
    }

    @Test
    @DisplayName("sumStrings('123','456') => '579'")
    void sumStringsExecutedSuccess2() {
        assertEquals("579", Kata.sumStrings("123", "456"));
    }

    @Test
    @DisplayName("sumStrings('123456768','12345') => '123469113'")
    void sumStringsExecutedSuccess3() {
        assertEquals("123469113", Kata.sumStrings("123456768", "12345"));
    }

    @Test
    @DisplayName("sumStrings('76763460563626','0384733186125574835621740') => '384733186202338296185366'")
    void sumStringsExecutedSuccess4() {
        assertEquals("384733186202338296185366", Kata.sumStrings("76763460563626", "0384733186125574835621740"));
    }

    @Test
    @DisplayName("sumStrings('00103','08567') => '8670'")
    void sumStringsExecutedSuccess5() {
        assertEquals("8670", Kata.sumStrings("00103", "08567"));
    }


}