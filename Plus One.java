class Solution {
    public int[] plusOne(int[] digits) {
        
    int n=digits.length;
        
    for(int i=n-1;i>=0;i--){
        
        if(digits[i]==9)
            digits[i]=0;
        else{
            digits[i]+=1;
            return digits;
        }
    }
        
        int a[]=new int[digits.length+1];
        a[0]=1;
        return a;
        
    }
}