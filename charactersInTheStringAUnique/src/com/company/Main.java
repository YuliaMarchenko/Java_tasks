package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	/* Given a String, write method to check if all its characters are unique. The string consists only of English letters.
	Solve the task at least by two different ways:
	by using methods of String class
	by using ascii value of characters.*/
    }

    public static boolean checkUniqueCharacters(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] != chars[i + 1])
                continue;
            else
                return false;
        }
        return true;
    }

    public static boolean checkUniqueCharactersWithAscii(String str) {
        if (str.length() > 256) {
            return false;
        }

        boolean[] isSeen = new boolean[256];
        Arrays.fill(isSeen, false);

        for (int i = 0; i < str.length(); i++) {
            int IndexAscii = (int) str.charAt(i);

            if (isSeen[IndexAscii] == true) {
                return false;
            }
            isSeen[IndexAscii] = true;
        }
        return true;
    }

    public static Map<String, String> ab(Map<String, String> mapAB) {
        if (mapAB.containsKey("a") && mapAB.containsKey("b")) {
            mapAB.put("ab", mapAB.get("a").concat(mapAB.get("b")));
        }
        return mapAB;
    }

    public static Map<String, Boolean> mapStringBoolean(String[] strings) {
        Map<String, Boolean> isMoreThanOne = new HashMap<>();
        for(String s: strings){
            if (isMoreThanOne.containsKey(s)){
                isMoreThanOne.put(s,true);
            } else {
                isMoreThanOne.put(s, false);
            }
        }
        return isMoreThanOne;
    }

    public static int nameByNumberOccurence(List<String> list, String name){
        Map<String, Integer> nameToNumber = new HashMap<>();

        for(String s: list){
            if(nameToNumber.containsKey(s))
                nameToNumber.put(s, nameToNumber.get(s) + 1);
            else nameToNumber.put(s, 1);
        }

        return nameToNumber.containsKey(name)?nameToNumber.get(name):0;
    }

    public static List<String> removeDuplicates(List<String> input){
        Set<String> set = new HashSet<>(input);
        return new ArrayList<>(set);
    }
}
