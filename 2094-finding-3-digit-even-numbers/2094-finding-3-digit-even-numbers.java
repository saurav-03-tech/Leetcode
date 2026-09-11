class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int[] freq = new int[10];
        int[] res = new int[450];
        for (int i = 0; i < digits.length; i++) {
            freq[digits[i]]++;
        }
        int ans = 0;
        int num = 0;
        for (int h = 1; h <= 9; h++) {
            if (freq[h] > 0) {
                freq[h]--;
                for (int t = 0; t <= 9; t++) {
                    if (freq[t] > 0) {
                        freq[t]--;
                        for (int o = 0; o <= 8; o += 2) {
                            if (freq[o] > 0) {
                                num = 100 * h + 10 * t + o;
                                res[ans] = num;
                                ans++;
                            }
                        }
                        freq[t]++;
                    }
                }
                freq[h]++;
            }
        }

        return Arrays.copyOf(res, ans);
    }
}