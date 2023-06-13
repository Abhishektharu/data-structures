package recursion;

public class XpowN {
    //using n;
    // public static int calPower(int x, int n) {

    //     if (n == 0) {
    //         return 1;
    //     }
    //     if (x == 0) {
    //         return 0;
    //     }

    //     int xPowerm1 = calPower(x, n - 1);
    //     int xPown = xPowerm1 * x;
    //     return xPown;

    // }

    // using logn

    public static int calPower(int x, int n){
        if(n == 0){
            return 1;
        }
        if( x== 0){
            return 0;
        }

        //if n == even
        if(n % 2 == 0){
            return calPower(x, n/2) * calPower(x, n/2); 
        }

        else{
            return calPower(x, n/2) * calPower(x, n/2) * x;
        }
    }
    public static void main(String[] args) {
        int x = 2, n = 5;
        System.out.println(calPower(x, n));
    }
}
