package Tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Pair_In_Array {
    public static void main(String[] args) {
        int test=0;
        ArrayList<Integer> arrayList=new ArrayList<>();
        System.out.print("ArrayList size: ");
        Scanner sc=new Scanner(System.in);
        int arrayListLength=sc.nextInt();
        for(int i=0;i<arrayListLength;i++){
            arrayList.add(sc.nextInt());
        }
        System.out.print("Enter the K value: ");
        int k=sc.nextInt();
        for(int i=0;i<arrayListLength;i++){
            for(int j=1;j<arrayListLength;j++){
                if(arrayList.get(i)+arrayList.get(j)==k){
                    test+=1;
                }
            }
        }
        if(test==0){
            System.out.println("false");
        }
        else{
            System.out.println(true);
        }
    }
}
