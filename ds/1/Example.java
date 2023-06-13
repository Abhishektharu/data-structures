public class Example {

    public static void main(String[] args) {
        int[] arr;
        arr = new int[7];
        // arr[0] = 1;
        // arr[1] = 2;
        // arr[2] = 3;
        // arr[3] = 4;
        // arr[4] = 5;
        // arr[5] = 6;
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int del_num = 4;

        for(int i = 0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }

        System.out.println("");

        for(int i = 0; i<a.length; i++)
        {
            if(del_num == a[i]){
                for(int j = i;j<a.length-1; j++){
                    a[j] = a[j+1];
                }
                break;
            }
        }
        System.out.println("After deletion of 4");
        for(int i = 0; i<a.length-1; i++){
            System.out.print(a[i] + " ");
        }
    }
}
