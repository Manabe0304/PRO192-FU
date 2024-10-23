public class MyString implements IString {

    @Override
    public int f1(String str) {
        int count = 0;
        String[] words = str.split("\\s+");
        
        for (String word : words) {
            int oddDigitCount = 0;
            for (char ch : word.toCharArray()) {
                if (Character.isDigit(ch) && (ch - '0') % 2 != 0) {
                    oddDigitCount++;
                }
            }
            if (oddDigitCount >= 2) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String f2(String str) {
        String[] words = str.split("\\s+");
        String shortestWord = words[0];
        String longestWord = "";

        // Find longest and shortest words
        for (String word : words) {
            if (word.length() < shortestWord.length()) {
                shortestWord = word;
            }
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return str.replaceFirst(shortestWord, String.valueOf(longestWord.length()));
    }
}
