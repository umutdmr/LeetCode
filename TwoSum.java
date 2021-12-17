// https://leetcode.com/problems/two-sum/
package LeetCode;
import java.util.HashMap;

class TwoSum 
{
    public int[] twoSum(int[] nums, int target) 
    {
        int[] res = new int[2];
        HashMap<Integer, Integer> sums = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {

            if (sums.containsKey(target - nums[i])) {

                res[0] = sums.get(target - nums[i]);
                res[1] = i;

            } else {
                sums.put(nums[i], i);
            }
        }

        return res;
    }
}