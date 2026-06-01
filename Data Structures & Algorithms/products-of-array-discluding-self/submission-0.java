class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;

        int pp[] = new int[n];
        pp[0] = 1;

        for(int i=1; i<n; i++) {
            pp[i] = pp[i-1] * nums[i-1]; 
        }

        int sp[] = new int[n];
        sp[n-1] = 1;

        for(int i=n-2; i>=0; i--) {
            sp[i] = sp[i+1] * nums[i+1];
        }

        for(int i=0; i<n; i++) {
            sp[i] = sp[i] * pp[i];
        }

        return sp;
    }
}  
