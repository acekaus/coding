package basics;

public class HCFAndLCM {
    public static int hcf(int a, int b) {
        if (a == b) {
            return a;
        }
       int c= (a > b) ? a%b:b%a;
        if(c==0){
            return b;
        }
        else
        {
            return hcf(b,c);
        }
    }
    public static int lcm(int a, int b) {
        return (a*b)/hcf(a,b);
    }
    public static void main(String[] args) {
        int hcf= hcf(20,28);
        System.out.println(hcf);
        System.out.println(lcm(20,28));
    }
}
