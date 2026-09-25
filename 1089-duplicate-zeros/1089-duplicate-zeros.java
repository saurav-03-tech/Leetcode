class Solution {
    public void duplicateZeros(int[] arr) {
        int n=arr.length;
        int r=0;
        while(r<n){
            if(arr[r]==0){
                if(r==n-1){
                    break;
                }
                for(int i=n-1;i>=r+1;i--){
                    arr[i]=arr[i-1];
                }
                arr[r+1]=0;
                r+=2;
            }
            else{
                r++;

            }
            
            
        }
    }
}