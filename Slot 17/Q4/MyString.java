public class MyString implements IString {
    
    // f1: Count and return number of prime digits in str
    @Override
    public int f1(String str) {
        int primeDigitCount = 0;
        for (char ch : str.toCharArray()) {
            if (isPrimeDigit(ch)) {
                primeDigitCount++;
            }
        }
        return primeDigitCount;
    }

    // Helper method to check if a character is a prime digit
    private boolean isPrimeDigit(char ch) {
        return ch == '2' || ch == '3' || ch == '5' || ch == '7';
    }

    // f2: Reverse order of all words in str
    @Override
    public String f2(String str) {
        String[] words = str.split(" ");
        StringBuilder reversedStr = new StringBuilder();
        
        for (int i = words.length - 1; i >= 0; i--) {
            reversedStr.append(words[i]);
            if (i > 0) {
                reversedStr.append(" ");
            }
        }
        return reversedStr.toString();
    }
}
