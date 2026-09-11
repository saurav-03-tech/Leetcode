class Solution {
    public int totalNumbers(int[] digits) {
        int even=0;
        int evendig=0;
        int[] freq=new int [10];
        for(int i=0;i<digits.length;i++){
            freq[digits[i]]++;
        }
        int count = 0;
        for (int u = 0; u <= 8; u += 2) {
            if (freq[u] == 0)
                continue;
            freq[u]--;
            for (int h = 1; h <= 9; h++) {
                if (freq[h] == 0)
                    continue;

                freq[h]--;
                for (int t = 0; t <= 9; t++) {

                    if (freq[t] > 0) {
                        count++;
                    }
                }

                freq[h]++;
            }

            freq[u]++;
        }return count;
        
        
    }
}