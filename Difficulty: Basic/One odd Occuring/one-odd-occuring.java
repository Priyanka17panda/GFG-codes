class Solution {
    // Method to find the element with odd occurrence in given array
    int getOddOccurrence(int[] arr) {
        // code here
        HashMap<Integer,Integer> hash=new HashMap<>();
        for(int i:arr){
            hash.put(i,hash.getOrDefault(i,0)+1);
        }
      
        for(int key:hash.keySet()){
            int times=hash.get(key);
            if(times%2!=0)
            return key;
        }
        return -1;
    }
}