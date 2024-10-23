/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class MyString implements IString {
    @Override
    public int f1(String str) {
        int count = 0;
        String[] words = str.split("\\s+");
        
        for (String word : words) {
            int evenDigitCount = 0;
            for (char ch : word.toCharArray()) {
                if (Character.isDigit(ch) && (ch - '0') % 2 == 0) {
                    evenDigitCount++;
                }
            }
            if (evenDigitCount >= 2) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String f2(String str) {
        String[] words = str.split("\\s+");
        String longestWord = "";
        String shortestWord = words[0];

        // Find longest and shortest words
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
            if (word.length() < shortestWord.length()) {
                shortestWord = word;
            }
        }

        return str.replaceFirst(longestWord, String.valueOf(shortestWord.length()));
    }
}
