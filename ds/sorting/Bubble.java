package sorting;
class ArrayBub{
   private long[] a;
    private int nElems;

    public ArrayBub(int max){
        a = new long[max];
        nElems = 0;
    }

    public void insert(long value){
        a[nElems] = value;
        nElems++;
    }

    public void display(){
        for(int i = 0 ; i<nElems; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }

    public void BubbleSort(){
        for(int i = 0; i<nElems; i++){
            for(int j=0; j<nElems -1 -i; j++){
                if(a[j] > a[j+1] ){
                    swap(j, j+1);
                }
            }
        }
    }

    public void swap(int one , int two){
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
}

class Bubble{
    public static void main(String[] args) {
        int maxSize= 15;
        ArrayBub arr ; //reference
        arr = new ArrayBub(maxSize); //new 
        arr.insert(4);
        arr.insert(47);
        arr.insert(41);
        arr.insert(43);
        arr.insert(453);
        arr.insert(13);
        arr.insert(123);
        arr.insert(353);
        arr.insert(31);
        arr.insert(232);
        arr.insert(263);
        arr.insert(233);
        arr.insert(203);
        // arr.insert(213);
        arr.insert(293);
        arr.insert(0);

        arr.display();

        arr.BubbleSort();

        arr.display();
    }
}