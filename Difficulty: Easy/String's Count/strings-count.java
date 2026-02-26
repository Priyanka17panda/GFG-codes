// User function Template for Java
class Solution {
    static long countStr(long n) {
        // code here
        long sum = 0;
	    sum += 1; // all a
	    sum += n; // all a + 1 b
	    sum += n; // all a + 1c
	    if (n>=2)
	    sum += n*(n-1); // all a + 1b + 1c
	    if (n>=2)
	    sum += n*(n-1)/2; // all a + 2c
	    if (n>=3)
	    sum += n*(n-1)*(n-2)/2; // all a + 1b + 2c
	    return sum;
    }
}