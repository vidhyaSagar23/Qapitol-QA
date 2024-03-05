package org.junit.assessment;

public class StringUtils {

    public String reverse(String word) {
        StringBuilder sb=new StringBuilder();
        for (int i = word.length()-1; i >=0 ; i--) {
            sb.append(word.charAt(i));
        }
        return sb.toString();
    }

    public String upperCase(String word) {
        return word.toUpperCase();
    }

    public boolean isPalindrome(String word) {
        int i = 0;
        int j = word.length() - 1;
        while (i < j) {
            if (word.charAt(i) != word.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
