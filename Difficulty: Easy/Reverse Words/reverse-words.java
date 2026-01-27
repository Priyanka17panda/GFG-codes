class Solution {
    public String reverseWords(String s) {
        // Split words using dot
        String[] words = s.split("\\.");
        StringBuilder sb = new StringBuilder();

        // Traverse from last to first
        for (int i = words.length - 1; i >= 0; i--) {
            
            // Ignore empty strings caused by extra dots
            if (words[i].length() == 0) continue;

            sb.append(words[i]);
            sb.append(".");
        }

        // Remove last extra dot
        sb.deleteCharAt(sb.length() - 1);

        return sb.toString();
    }
}
