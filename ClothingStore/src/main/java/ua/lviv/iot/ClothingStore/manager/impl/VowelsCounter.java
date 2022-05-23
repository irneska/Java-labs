package ua.lviv.iot.ClothingStore.manager.impl;

import ua.lviv.iot.ClothingStore.manager.IVowelsCounter;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class VowelsCounter implements IVowelsCounter {
    @Override
    public List<Integer> countVowels(String text) {
        List<Integer> counters = new ArrayList<>();
        text = text.replaceAll("\\.", "! ");
        text = text.replaceAll("\\?", "! ");

        for (String sentence : text.split("! ")) {
            String reg = String.format("(?i)[aeiou]");
            Pattern pattern = Pattern.compile(reg);
            Matcher matcher = pattern.matcher(sentence);
            System.out.println(sentence);
            int counter = 0;
            while (matcher.find()) {
                sentence = sentence.replaceAll("\\s+", "");
                counter = sentence.toLowerCase().replaceAll("[b-df-hj-np-tv-z]", "").length();
            }
            counters.add(counter);


        }
        return counters;
    }
}



