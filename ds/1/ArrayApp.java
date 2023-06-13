public class ArrayApp{
    public static void main(String[] args) {
        long[] arr ; //reference to array
        arr = new long[100]; // make array
        long nElements = 0;
        int i;
        long searchKey;

        arr[0] = 77;
        arr[1] = 99;
        arr[2] = 44;
        arr[3] = 45;
        arr[4] = 3;
        arr[5] = 58;
        arr[6] = 90;
        arr[7] = 10;
        arr[8] = 23;
        arr[9] = 4;

        nElements = 10;

        for(i=0;i<nElements; i++){
            System.out.println(arr[i] + " ");
        }

        //search a key from an array;
        searchKey = 23;
        for(i = 0; i<nElements; i++){
            if(arr[i] == searchKey){
                break;
            }
        }
        if(i == nElements){
            
        }
    }
}