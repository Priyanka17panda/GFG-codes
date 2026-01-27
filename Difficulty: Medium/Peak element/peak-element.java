class Solution {
    public int peakElement(int[] arr) {
        // code here
        int n = arr.length;
 
        // check first element because this can be peak also wrt right
        if (n == 1 || arr[0] >= arr[1])
            return 0;

        // check middle elements
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
                return i;
            }
        }

        // check last element because this can be peak also wrt left
        if (arr[n - 1] >= arr[n - 2])
            return n - 1;

        return -1;
    }
}