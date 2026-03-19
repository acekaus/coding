package basics;

public class MaxAndMIn {
    public static int max(int a,int b,int c){
          a= Math.max(a,b);
       return Math.max(a,c);
    }
    public static int min(int a,int b,int c){
          a= Math.min(a, b);
        return Math.min(a, c);
    }
    public static void main(String[] args) {
        System.out.println
                (max(1,6,3));
        System.out.print(min(9,7,23));
    }
}
