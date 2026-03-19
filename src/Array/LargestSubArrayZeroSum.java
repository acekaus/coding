package Array;

import java.util.HashMap;

public class LargestSubArrayZeroSum {
    public static int largestSubArrayZeroSum(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int max=0;
        int sum=0;
        HashMap<Integer,Integer> hashmap=new HashMap();
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
            if(hashmap.containsKey(sum))
            {
                max=Math.max(max,i);
            }
            else
            {
                hashmap.put(sum,i);
            }
        }
        return max;
    }
    public static void main(String[] args) {
       int nums[]={15,-2,2,-8,1,7,10,23};
       System.out.println(largestSubArrayZeroSum(nums));
    }
}
