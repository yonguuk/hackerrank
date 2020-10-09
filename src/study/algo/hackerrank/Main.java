package study.algo.hackerrank;

import study.algo.hackerrank.hashmap.RansomNote;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] magazine = "give me one grand today night".split(" ");
        String[] note = "give one grand today".split(" ");
        RansomNote.checkMagazine(magazine, note);
    }
}
