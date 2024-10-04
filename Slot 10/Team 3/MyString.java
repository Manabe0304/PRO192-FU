/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class MyString implements IString, Cloneable {
    @Override
    public int f1(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        String[] words = s.split("\\s+");
        int count = 0;

        
        for (String word : words) {
            if (containsEvenDigit(word)) {  // Check if the word contains an even digit
                count++;
            }
        }
        return count;
    }

    private boolean containsEvenDigit(String word) {
        for (char c : word.toCharArray()) {
            if (c == '0' || c == '2' || c == '4' || c == '6' || c == '8') {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public String f2(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }

        String[] words = s.split("\\s+"); // Split by spaces
        for (int i = 0; i < words.length; i++) {
            if (isPalindrome(words[i])) {
                words[i] = "YY"; // Replace the first palindrome with "YY"
                break;
            }
        }
        return String.join(" ", words);
    }

    private boolean isPalindrome(String word) {
        String cleanedWord = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
        int len = cleanedWord.length();

        for (int i = 0; i < len / 2; i++) {
            if (cleanedWord.charAt(i) != cleanedWord.charAt(len - 1 - i)) {
                return false;
            }
        }

        return len > 1;
    }

    public MyString clone() {
        return new MyString();
    }
}
