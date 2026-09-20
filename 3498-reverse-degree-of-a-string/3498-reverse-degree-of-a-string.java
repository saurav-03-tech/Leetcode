class Solution {
    public int reverseDegree(String s) {
        int n= s.length();
        int ans=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            int rev = 0;
            if (ch >= 'a' && ch <= 'z') {
                rev = 26 - (ch - 'a'); 
            } else if (ch >= 'A' && ch <= 'Z') {
                rev = 26 - (ch - 'A'); 
            }
            ans=ans+rev*(i+1);

        }
        return ans;
    }
}