import java.util.*;

public class LLJFrame {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        // list.addFirst("a");
        // System.out.println(list);
        // list.addFirst("is");
        // System.out.println(list);
        // list.addFirst("this");
        // System.out.println(list);
        // list.addLast("an");
        // System.out.println(list);
        // list.addLast("Example");
        // System.out.println(list);

        // System.out.println();
        // System.out.println("The is size is " + list.size());

        // for (int i = 0; i < list.size(); i++) {
        //     System.out.println(list.get(i) + " ");
        // }

        // System.out.println("index is : " + list.indexOf("an"));

        // Take elements(numbers in the range of 1-50) of a Linked List as input from
        // the user. Delete all nodes which have values greater than 25.

        Scanner sc = new Scanner(System.in);
        System.out.println("enter list numbers ");
        int input = sc.nextInt();

        while(input !=0){
            System.out.println("enter numbers ");
            int a = sc.nextInt();


            list.add(a);
            input--;
        }
        System.out.println(list);
        sc.close();



        
    }
}
