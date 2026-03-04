class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        Set<Integer> set = new HashSet<>();
        
        for (int i = 0 ; i < arr.length ; i++){
            int numExist = target - arr[i];
            if(set.contains(numExist)){
                return true;
            }else {
                set.add(arr[i]);
            }
        }
        return false;
    }
}