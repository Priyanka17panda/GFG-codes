class Solution {
    public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        // code here
        ArrayList<Integer> ans = new ArrayList<Integer>();
        
        if(k==1) {
            for(int i=0;i<arr.length;i++) {
                ans.add(arr[i]);
            }
            return ans;
        }
        
        int max=Integer.MIN_VALUE;
        int maxIndex=-1;
        for(int i=0;i<k;i++) {
            if(arr[i]>max) {
                max=arr[i];
                maxIndex=i;
            }
        }
        ans.add(max);
        
        int startIndex=1;
        int lastIndex=k;
        
        while(lastIndex<arr.length) {
            if((startIndex<=maxIndex && maxIndex<lastIndex) || 
            (startIndex<maxIndex && maxIndex<=lastIndex)) {
                if(arr[lastIndex]>max) {
                    max=arr[lastIndex];
                    maxIndex=lastIndex;
                }
                ans.add(max);
            } else {
                max=Integer.MIN_VALUE;
                for(int i=startIndex;i<=lastIndex;i++) {
                    if(arr[i]>max) {
                        max=arr[i];
                        maxIndex=i;
                    }
                }
                ans.add(max);
            }
            startIndex++;
            lastIndex++;
        }
        return ans;
    }
}