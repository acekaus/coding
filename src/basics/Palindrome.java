package basics;

public class Palindrome {
    public  static boolean isPalindromeString(String str)
    {
        int size=str.length()-1;
        for(int i=0;i<=size/2;i++)
        {
            if(str.charAt(i)!=str.charAt(size-i))
            {
                return false;
            }
        }
        return true;
    }
    public static boolean isPalindromeNumber(int num)
    {
        int size=(""+num).length();
        int[] arr=new int[size];
        int i=0;
        while(num>0)
        {
          arr[i]=num%10;
          i++;
          num=num/10;
        }
        for(int j=0;j<=arr.length/2;j++)
        {
            if(arr[j]!=arr[arr.length-j-1])
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        System.out.println(isPalindromeString("abcbba"));
        System.out.println(isPalindromeNumber(123213));
    }
}
