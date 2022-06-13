public class LongestPalindromeSubString {
    public static void main(String[] args) {

    }

    int resultStart;
    int resultLength;

    public  String longestPalindrome(String s) {

        int strLength = s.length();
        if (strLength < 2) return s;
        for (int i = 0; i < strLength - 1; i++) {
            expandRange(s, i, i);
            expandRange(s, i, i + 1);
        }
        return s.substring(resultStart, resultStart + resultLength);
    }

    public void expandRange(String str, int begin, int end) {
        while (begin >= 0 && end < str.length() && str.charAt(begin) == str.charAt(end)) {
            begin--;
            end++;
        }
        if (resultLength < end - begin - 1) {
            resultStart = begin + 1;
            resultLength = end - begin - 1;
        }
    }
}
