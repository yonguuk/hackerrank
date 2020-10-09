package study.algo.hackerrank.hashmap;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class TwoStrings {
//    public static String twoStrings(String s1, String s2) {
//
//        Set<String> substrings = Arrays.stream(s1.split(""))
//                .collect(Collectors.toSet());
//
//        for(int i=0; i<s2.length(); ++i){
//            if(substrings.contains(s2.charAt(i)+""))
//                return "YES";
//        }
//        return "NO";
//    }

    public static String twoStrings(String s1, String s2) {

        String longerStr = s1.length() >= s2.length() ? s1 : s2;
        String shorterStr = s1.length() < s2.length() ? s1 : s2;

        Set<String> longerSet = Arrays.stream(longerStr.split(""))
                .collect(Collectors.toSet());
        Set<String> shorterSet = Arrays.stream(shorterStr.split(""))
                .collect(Collectors.toSet());

        longerSet.retainAll(shorterSet);
        longerSet.forEach(System.out::println);

        return "NO";
    }
}
