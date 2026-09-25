class Solution {
    public int heightChecker(int[] heights) {
        int[] freq = new int[101];
        for (int x : heights) {
            freq[x]++;
        }
        int count = 0;
        int expected = 1;
        for (int i = 0; i < heights.length; i++) {
            while (freq[expected] == 0) {
                expected++;
            }
            if (heights[i] != expected) {
                count++;
            }
            freq[expected]--;
        }
        return count;
    }
}