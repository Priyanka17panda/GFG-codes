class Solution {
    int thirdLargest(int arr[]) {
        // code here
        if (arr.length < 3)
            return -1;
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        for (int number : arr) {
            if (number > first) {
                third = second;
                second = first;
                first = number;
            } else if (number > second) {
                third = second;
                second = number;
            } else if (number > third)
                third = number;
        }
        return third;
    }
}