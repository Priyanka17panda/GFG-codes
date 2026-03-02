// User function Template for Java

import java.util.*;

class Solution {
    String secFrequent(String arr[], int nums) {

        HashMap<String, Integer> map = new HashMap<>();

        // Count frequency
        for (int i = 0; i < nums; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int first = 0, second = 0;

        // Find first and second highest frequency
        for (int freq : map.values()) {
            if (freq > first) {
                second = first;
                first = freq;
            } else if (freq > second && freq < first) {
                second = freq;
            }
        }

        // Find the string with second highest frequency
        for (String key : map.keySet()) {
            if (map.get(key) == second) {
                return key;
            }
        }

        return "";
    }
}