package study.algo.hackerrank.hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class RansomNote {
    public static void checkMagazine(String[] magazine, String[] note){
        Map<String, Integer> magazineMap = Arrays.stream(magazine)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(e->1)));

        Map<String, Integer> noteMap = Arrays.stream(note)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(e->1)));

        boolean invalid = noteMap.entrySet().stream()
                .anyMatch(e -> !magazineMap.containsKey(e.getKey())
                    || e.getValue() > magazineMap.get(e.getKey()));

        if(invalid)
            System.out.println("No");
        else
            System.out.println("Yes");

    }
}
