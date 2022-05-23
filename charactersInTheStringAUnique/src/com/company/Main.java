package com.company;

import java.util.Arrays;

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
}
