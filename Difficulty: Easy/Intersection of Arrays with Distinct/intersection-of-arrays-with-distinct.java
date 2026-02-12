class Solution {
    public static int intersectSize(int a[], int b[]) {
        // Your code here
        Set<Integer> set= new HashSet<>();
        int count=0;
        for(int element:a) set.add(element);
        for(int element:b){
            if(!set.add(element)){
                count++;
            }
        }
        return count;
    }
}