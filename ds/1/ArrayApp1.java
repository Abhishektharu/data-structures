class LowArray{
    private long[]a; //reference to array a

    public LowArray(int size){
        a = new long[size];

    } //constructor of LowArray

    //set elements 
    public void setElem(int index, long value ){
        a[index] = value;
    }

    public long getElem(int index){
        return a[index];
    }
}

public class ArrayApp1 {
    public static void main(String[] args) {
        LowArray arr;
        arr = new LowArray(100);

        LowArray arr1 = new LowArray(3);
        System.out.println(arr1.getClass());
        // LowArray arr = new LowArray(100);
        arr.setElem(0, 77);
        arr.setElem(1, 177);
        arr.setElem(2, 177);
        arr.setElem(3, 2);
        arr.setElem(4, 2);
        arr.setElem(5, 2);
        arr.setElem(6, 2);
        arr.setElem(7, 2);

        int nElems = 0;
        int j;

        //display
        for(j = 0; j<nElems; j++){
            System.out.println(arr.getElem(j));
        }

        //search 
        int searchKey = 2;
        for(j=0;j<nElems; j++){
            if(arr.getElem(j) == searchKey){
                break;
            }
            if(j == nElems){
                System.out.println("Can't find " + searchKey);
            }
            else
                System.out.println("Found " + searchKey);
        }


        //delete
        for(j=0;j<nElems; j++){
            if(arr.getElem(j) == 55){break;}

        }

        for(int k = j ; k<nElems; k++){
            arr.setElem(k, arr.getElem(k + 1));
            nElems--;
        }

        for(j = 0; j<nElems; j++){
            System.out.println(arr.getElem(j) + " ");
            System.out.println("");
        }
    }
}
