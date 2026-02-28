class Solution {
    public static boolean isRotated(String s1, String s2) {
        // code here
         // code here
        if (s1.length() != s2.length()) return false;
        
        return (checkRotation(s1, s2, s2.length() - 2)) ? 
                    true : checkRotation(s1, s2, 2);
    }
    
    private static boolean checkRotation(String s1, String s2, int j) {
        
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(j % s2.length())) return false;
            j++;
        }
        return true;
    }
}