package Array;

import java.util.ArrayList;
import java.util.List;

public class ArrayOperations {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list=new ArrayList();
        int largest= 0;
        for(int i=0;i<candies.length;i++)
        {
            if(largest<candies[i])
            {
                largest=candies[i];
            }
        }
        for(int i:candies)
        {

            if(i+extraCandies>=largest)
            {
                list.add(true);
            }
            else
            {
                list.add(false);
            }
        }
        return list;
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] ans= new int[nums.length];
        int i=0;
        int j=1;
        for(int k=0;k<n;k++)
        {
            ans[i]=nums[k];
            ans[j]=nums[n+k];
            i=i+2;
            j=j+2;
        }
        return ans;
    }
    public static int maximumWealth(int[][] accounts) {
        int row= accounts.length;
        int column= accounts[0].length;
        int max_sum=0;
        for(int i=0;i<row;i++)
        {
            int sum=0;
            for(int j=0;j<column;j++)
            {
                sum=sum+accounts[i][j];
            }
            max_sum=max_sum>sum?max_sum:sum;
        }
        return max_sum;
    }
    public static  int[] runningSum(int[] nums) {
        int[] ans= new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++ )
        {
            sum=sum+nums[i];
            ans[i]= sum;
        }
        return ans;
    }
    public static int[] getConcatenation(int[] nums) {
        int length= nums.length;
        int ans[]= new int[2*length];
        /* for linear time complexity
        System.arraycopy(nums,0,ans,0,n);
        System.arraycopy(nums,0,ans,n,n);
         */
        for(int i=0;i<length;i++)
        {
            ans[i]=nums[i];
            ans[length+i]=nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums= getConcatenation(new int[]{1,2,3,4,5,6,7,8,9,10});

    }
}
