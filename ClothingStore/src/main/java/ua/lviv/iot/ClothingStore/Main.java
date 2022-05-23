package ua.lviv.iot.ClothingStore;

import ua.lviv.iot.ClothingStore.manager.impl.VowelsCounter;

public class Main {
    public static void main(String[] args) {
        String text = """
                As for me, spring is the best time! I like it the most. What about you? I agree with you.
                """;

        VowelsCounter vowelsCounter = new VowelsCounter();

        System.out.println(vowelsCounter.countVowels(text));

    }
}
