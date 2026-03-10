class Solution {
    public int findKRotation(int arr[]) {
        // Code here
        int n = arr.length;
        int rotateCount = 0;
        for (int i = n-1; i>=1; i--){
            if(arr[i] < arr[i-1]){
                rotateCount = i;
            }
        }
        return rotateCount;
    }
}