class Solution {
    public int totalNumbers(int[] digits) {
        int even=0;
        int evendig=0;
        int[] freq=new int [10];
        for(int i=0;i<digits.length;i++){
            freq[digits[i]]++;
        }
        int count = 0;
        for (int one = 0; one <= 8; one += 2) {
            if (freq[one] == 0){
                continue;
            }
            else{
                freq[one]--;
            }  
            for (int hundred = 1; hundred <= 9; hundred++) {
                if (freq[hundred] == 0){
                    continue;
                }  
                freq[hundred]--;
                for (int ten = 0; ten <= 9; ten++) {
                    if (freq[ten] > 0) {
                        count++;
                    }
                }
                freq[hundred]++;
            }
            freq[one]++;
        }return count;    
    }
}