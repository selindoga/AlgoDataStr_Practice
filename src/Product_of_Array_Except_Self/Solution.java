package Product_of_Array_Except_Self;

import java.util.Arrays;

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        /*
         O(n) time comp
         O(n) space comp (there is a better solution with O(1) space complexity)
         Explanation of my solution: https://leetcode.com/problems/product-of-array-except-self/solutions/4396085/java-o-n-time-comp-o-n-space-comp/
        */
        int n = nums.length;
        int[] pre = new int[n];
        Arrays.fill(pre,1);
        for(int i = 1 ; i<n ; i++){
            pre[i] = pre[i-1] * nums[i-1];
        }
        int[] suf = new int[n];
        Arrays.fill(suf,1);
        for(int i = n-2 ; i >=0 ; i--){
            suf[i] = nums[i+1] * suf[i+1];
        }
        for(int i = 0 ; i<n ; i++){
            suf[i] *= pre[i];
        }
        return suf;
    }
}
