package recursion;

public class Factorial {

    public static int findFactorial(int n){
        if(n == 1 || n == 0){
            return 1;
        }

        
        int n_nm1 = findFactorial(n - 1);
        int fact = n * n_nm1;

        return fact;
    }
    public static void main(String[] args) {
        System.out.println(findFactorial(5));
    }
}
