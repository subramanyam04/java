import java.util.*;
import java.io.*;
class LinearSerach {
    int pos=-1,key;
    boolean linearSearch(int array[],int size) {
        System.out.print("Read the key value: ");
        Scanner inPut=new Scanner(System.in);
        key=inPut.nextInt();
        for(int i=0;i<size;i++) {
            if(key==array[i]) {
                pos=i+1;
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner inPut=new Scanner(System.in);
        Main obj=new Main();
        System.out.print("Enter the size of Array: ");
        int size=inPut.nextInt();
        int[] array=new int[size];
        System.out.print("Read the Value: ");
        for(int i=0;i<size;i++) {
            array[i]=inPut.nextInt();
        }
        if(obj.linearSearch(array,size)) {
            System.out.println("Give "+obj.key+" is found at "+obj.pos);
        }
        else {
            System.out.println("Given key is not found");
        }
    }
}
