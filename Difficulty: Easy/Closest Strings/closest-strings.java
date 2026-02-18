// User function Template for Java

class Solution {
    int shortestDistance(ArrayList<String> s, String word1, String word2) {
        // code here
        Integer w1=null;
        Integer w2=null;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<s.size();i++){
            if(word1.equals(s.get(i))){
                 w1=i;
                if(w2!=null) ans=Math.min(Math.abs(w2-w1),ans);
            }
            if(word2.equals(s.get(i))){
                 w2=i;
                if(w1!=null)ans=Math.min(Math.abs(w2-w1),ans);
            }
        }
        return ans;
    }
};