package Two_Sum;

import java.util.ArrayList;
import java.util.Arrays;

// 1. Two Sum
public class Solution {
    int[] fin = new int[2];
    public int[] twoSum(int[] nums, int target) { // O(n^2)
        for (int a=0 ; a<nums.length ; a++) {
            for(int k=a+1; k< nums.length ; k++){
                if(nums[a]+nums[k] == target){
                    fin[0] = a;
                    fin[1] = k;
                }
            }
        }
        return fin;
    }

    // to check whether that sequence exists (return boolean instead of the sequence itself)
    public boolean anotherTwoSum(int[] nums, int target){
        Arrays.sort(nums);
        int i = 0, k = nums.length-1; // bunlar index
        while(true){
            if(i == k){
                break;
            }
            if(target < nums[i]){
                break;
            }
            if(nums[k] + nums[i] == target){
                return true;
            }else if(nums[k] + nums[i] < target){
                i++;
            }
            else if(nums[k] + nums[i] > target){
                k--;
            }
        }
        return false;
    }

    // below is for testing
    int[] aa = {5,9,0,77,1,6,41};
    public static void main(String[] args) {
        Solution sol = new Solution();
        boolean v = sol.anotherTwoSum(sol.aa,0);
        System.out.print(v);
    }

}
