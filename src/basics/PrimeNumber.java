package basics;

import java.util.ArrayList;

public class PrimeNumber {
    public static ArrayList<Integer> getPrimeNumbers(int a, int b)
    {
        ArrayList<Integer> list= new ArrayList();
        for(int i=a;i<=b;i++)
        {
            if(isPrime(i))
            {
                list.add(i);
            }
        }
        return list;
    }
    public static boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(13));
        ArrayList<Integer> list = getPrimeNumbers(13,100);
        for(int i: list)
        {
            System.out.println(i);
        }
    }
}
