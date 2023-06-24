import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3, 2, 3};
        int target = 6;
        int[] newnums = solution.twoSum(nums, target);

        System.out.println("Indices of the two numbers that add up to the target:");
        System.out.println(newnums[0] + ", " + newnums[1]);
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] newsum = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int a = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == a) {
                    newsum[0] = i;
                    newsum[1] = j;
                    return newsum;
                }
            }
        }
        return newsum;
    }
}
