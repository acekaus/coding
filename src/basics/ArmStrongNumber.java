package basics;

public class ArmStrongNumber {
    public static boolean isArmsStrong(int num){
        int num1=num;
    String s= ""+num;
    int length = s.length();
    int sum=0;
   while(num>0)
    {
        int i=num%10;
        num=num/10;
        sum=sum+powerOfNumber(i,length);
    }
   if(sum==num1){
        return true;
    }
   return false;
}
public static int powerOfNumber(int n, int power)
{
    int result=1;
    for(int i=0;i<power;i++)
    {
        result= result*n;
    }
    return result;
}
public static void main(String [] args)
{
   System.out.println(isArmsStrong(154));
}
}
