package IntArray;

/**
 * Created by Администратор on 17.07.2016.
 */
public class IntArray {


    private int size = 0;
    private int[] store;


    public IntArray(){
        store = new int[size];
    }

    void push (int index, int value){
        if (size-1 < index) return;
        int[] a = store;
        store = new int [++size];
        int q=0;
        for (int i = 0; i < size-1; i++) {

            if (i == index ) {
                store[i]=value;
                q++;
            }
            store[i+q]=a[i];

        }
    }

    void push (int index, Integer value){
        if (size-1 < index) return;
        int[] a = store;
        store = new int [++size];
        int q=0;
        for (int i = 0; i < size-1; i++) {

            if (i == index ) {
                store[i]=value.intValue();
                q++;
            }
            store[i+q]=a[i];

        }
    }


    void pushBack (int value){

        int [] a=store;
        store = new int [++size];

        for (int i = 0; i < size-1; i++) {
            store[i]=a[i];
        }

        store[size-1] = value ;
    }
    void pushBack (Integer value){

        int [] a=store;
        store = new int [++size];

        for (int i : a) {
            store[i]=a[i];
        }

        store[size-1] = value.intValue() ;
    }

    int get(int i)
    {
        if (i >= size) return 0;
        return (store[i]);
    }

    int getSize(){
        return size;
    }

    void pushUnic(int value){
        boolean good=true;
        for (int i:store)
        {
            if (i==value) {
                good = false;
                break;
            }
        }
        if (good) pushBack(value);
    }
    void pushUnic(Integer value){
        boolean good=true;
        for (int i:store)
        {
            if (i==value) {
                good = false;
                break;
            }
        }
        if (good) pushBack(value.intValue());
    }

    void delete(int index)
    {
        if (index >= size ) return;

        for (int i = index; i < size-1; i++) {
            store[i] = store[i+1];
        }

        --size;

    }

    void print(){
        for (int i = 0; i < size ; i++) {
            System.out.print(store[i]);
            System.out.print(" ");
        }
        System.out.println("");
        System.out.println(" Printed. ");
    }
    public static void main(String[] args) {

        IntArray intA = new IntArray();

        intA.pushBack(4);
        intA.print();
        intA.delete(0);
        intA.print();

        intA.pushBack(4);
        intA.pushBack(5);
        intA.pushBack(7);

        intA.push(2, 6);
        intA.print();

        intA.pushUnic(8);
        intA.pushUnic(8);
        intA.pushUnic(7);
        intA.pushUnic(4);
        intA.pushUnic(11);

        intA.print();

    }

}
