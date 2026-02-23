// User function Template for Java
class Solution {
    // Function to find matching decimal representation of a string as on the keypad.
    public static String printNumber(String s, int n) {
        // Your code here
        String org = s.toUpperCase();
    HashMap<Character,Integer> map = new HashMap<>();
    int count=0;
    int j = 2;
    String finali ="";
    for (char c = 'A';c<='Z';c++){
        map.put(c,j);
        count++;
        if (j==7 || j==9){
            if (count==4){
                j++;
                count=0;
            }
        } else if (count==3){
            j++;
            count=0;
        }
  
    }
    for (int i =0; i < org.length();i++){
        if (map.containsKey(org.charAt(i))){
            finali+=map.get(org.charAt(i));
        }
    }
    return finali;
    }
}