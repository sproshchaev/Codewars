package com.prosoft;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Methods testing the Kata class:")
class KataTest {

    @Test
    @DisplayName("add('123', '321'); -> '444'")
    void addExecutedSuccess() {
        assertEquals("444", Kata.add("123", "321"));
    }

    @Test
    @DisplayName("add('11', '99'); -> '110'")
    void addExecutedSuccess2() {
        assertEquals("110", Kata.add("11", "99"));
    }

}