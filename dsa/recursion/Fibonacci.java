package recursion;


public class Fibonacci {
    public static void printFibbo(int a, int b, int n){
        if(n == 0){
            return ;
        }
        int c = a + b;
        System.out.println(c);
        printFibbo(b, c, n - 1);
    
    }
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);

        int n = 7;
        printFibbo(a, b, n-2);
    }
}
