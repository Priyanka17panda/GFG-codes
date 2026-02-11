class Solution {
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
        // code here
          int smallest = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        ArrayList<Integer> ans = new ArrayList<>();


        // Find smallest
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        // Find second smallest
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > smallest && arr[i] < second) {
                second = arr[i];
            }
        }

        if (second == Integer.MAX_VALUE) {
            ans.add(-1);
        } else {
            ans.add(smallest);
            ans.add(second);
        }

        return ans;
    }
}
