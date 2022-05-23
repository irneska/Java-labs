package ua.lviv.iot.ClothingStore.manager.impl;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class VowelsCounterTest {
    List<Integer> counters = Arrays.asList(10, 6, 6, 7, 0);
    VowelsCounter vowelsCounter = new VowelsCounter();
    String text = """
            As for me, spring is the best time! I like it the most. What about you? I agree with you.
            """;

    @Test
    void countVowels() {
        assertNotEquals(null, vowelsCounter.countVowels(text));
        assertEquals(counters, vowelsCounter.countVowels(text));
    }
}