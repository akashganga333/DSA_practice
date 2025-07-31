package String;

//Given a string s, sort it in decreasing order based on the frequency of the characters. The frequency of a character is the number of times it appears in the string.
//        Return the sorted string. If there are multiple answers, return any of them.
//        Example 1:
//        Input: s = "tree"
//        Output: "eert"
//        Explanation: 'e' appears twice while 'r' and 't' both appear once.
//        So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
//        Example 2:
//        Input: s = "cccaaa"
//        Output: "aaaccc"
//        Explanation: Both 'c' and 'a' appear three times, so both "cccaaa" and "aaaccc" are valid answers.
//        Note that "cacaca" is incorrect, as the same characters must be together.
//        Example 3:
//        Input: s = "Aabb"
//        Output: "bbAa"
//        Explanation: "bbaA" is also a valid answer, but "Aabb" is incorrect.
//        Note that 'A' and 'a' are treated as two different characters.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortCharactersByFrequency {
    static class Pair{
        char c;
        int count;
        Pair(char c, int count){
            this.c = c;
            this.count = count;
        }
    }

    public static void main(String[] args){
        String s = "Aabb";
        int[] arr = new int[127];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)]++;
        }
        ArrayList<Pair> pairs = new ArrayList<>();
        for(int i = 46; i<127; i++){
            if(arr[i]>0) pairs.add(new Pair((char)i,arr[i]));
        }

        Collections.sort(pairs, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o2.count - o1.count;
            }
        });

        StringBuilder sb = new StringBuilder();
        for(Pair p : pairs){
            int n = p.count;
            while(n-->0) sb.append(p.c);
        }

        System.out.println(sb.toString());

    }

}
