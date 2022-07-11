package Two_Sum;
// 1. Two Sum
public class Solution {
    int[] fin = new int[2];
    public int[] twoSum(int[] nums, int target) {
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
}
