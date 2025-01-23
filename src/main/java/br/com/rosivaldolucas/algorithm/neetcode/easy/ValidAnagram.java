package br.com.rosivaldolucas.algorithm.neetcode.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ValidAnagram {

    public static void main(String[] args) {
        String s = "jar";
        String t = "jam";

        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (mapS.containsKey(s.charAt(i))) {
                mapS.put(s.charAt(i), mapS.get(s.charAt(i)) + 1);
            } else {
                mapS.put(s.charAt(i), 1);
            }
            if (mapT.containsKey(t.charAt(i))) {
                mapT.put(t.charAt(i), mapT.get(t.charAt(i)) + 1);
            } else {
                mapT.put(t.charAt(i), 1);
            }
        }

        if (mapS.size() != mapT.size()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if (!(mapS.containsKey(s.charAt(i)) && mapT.containsKey(s.charAt(i)))) {
                return false;
            }

            Integer valueS = mapS.get(s.charAt(i));
            Integer valueT = mapT.get(s.charAt(i));

            if (!Objects.equals(valueS, valueT)) {
                return false;
            }
        }

        return true;
    }

}
