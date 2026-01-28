class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {

        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < a.length && j < b.length) {

            // Skip duplicates in a[]
            if (i > 0 && a[i] == a[i - 1]) {
                i++;
                continue;
            }

            // Skip duplicates in b[]
            if (j > 0 && b[j] == b[j - 1]) {
                j++;
                continue;
            }

            if (a[i] < b[j]) {
                result.add(a[i]);
                i++;
            } else if (a[i] > b[j]) {
                result.add(b[j]);
                j++;
            } else { // a[i] == b[j]
                result.add(a[i]);
                i++;
                j++;
            }
        }

        // Remaining elements of a[]
        while (i < a.length) {
            if (i == 0 || a[i] != a[i - 1]) {
                result.add(a[i]);
            }
            i++;
        }

        // Remaining elements of b[]
        while (j < b.length) {
            if (j == 0 || b[j] != b[j - 1]) {
                result.add(b[j]);
            }
            j++;
        }

        return result;
    }
}
