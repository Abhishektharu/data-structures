class ArraySel{
    private long a[];
    private int nElems;

    public ArraySel(int max){
        a = new long[max];
        nElems = 0;
    }

    public void insert(long value){
        a[nElems] = value;
        nElems++;
    }

    public void display(){
        for(int j=0; j<nElems; j++){
            System.out.print(a[j] + " ");
        }
    }

    public void selectionSort(){
        for(int i=0;i<nElems-1;i++){
            int min = i;
            for(int j=i+1;j<nElems;j++){
                if(a[j] < a[i]){
                    min = j;
                }
            }

            //swap
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;

        }
    }


}

public class SelectionSortApp {
    public static void main(String[] args) {
        int max = 10;
        ArraySel arr;
        arr = new ArraySel(max);

        arr.insert(23);
        arr.insert(2);
        arr.insert(53);
        arr.insert(0);
        arr.insert(2563);

        arr.display();
    }
}
