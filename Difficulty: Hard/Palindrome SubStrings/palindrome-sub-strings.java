class Solution {

    public int checkpalindrome(String s, int i, int j) {
        int count = 0;

        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            if ((j - i + 1) >= 2) {
                count++;
            }
            i--;
            j++;
        }
        return count;
    }

    public int countPS(String s) {
        int count = 0;

        for (int ctr = 0; ctr < s.length(); ctr++) {

            // Odd length palindrome
            int oddlen = checkpalindrome(s, ctr, ctr);

            // Even length palindrome
            int evenlen = checkpalindrome(s, ctr, ctr + 1);

            count = count + oddlen + evenlen;
        }

        return count;
    }
}