package recursion ;
// public class Rec {
//     public static void printNum(int n){
//         if(n==0){  //base condition
//             return ;
//         }

//         System.out.println(n); //print the value of i in each iteration;
//         printNum(n-1);  //call the function and decrement in each iteration;
//     }
//     public static void main(String[] args) {
//         printNum(5);
//     }
// }
//hello



// to print 1 to 5;
public class Rec{
    public static void printNum(int n){
        if(n > 5){
            return;
        }
        System.out.println(n);
        printNum(n+1);
    }
    public static void main(String[] args) {
        printNum(0);    
    }
}