package Tasks;
import java.util.ArrayList;
import java.util.Scanner;

public class Array_SubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the main array size:");
        int arrayLength = sc.nextInt();
        int test = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < arrayLength; i++) {
            arrayList.add(sc.nextInt());
        }
        System.out.print("Enter the sub array size:");
        int subArrayLength = sc.nextInt();
        ArrayList<Integer> subArray = new ArrayList<>();
        for (int i = 0; i < subArrayLength; i++) {
            int ele = sc.nextInt();
            subArray.add(ele);
            if (arrayList.contains(ele)) {

                test += 1;
//            break;
            }
        }
        if (subArrayLength == test)
            System.out.println(true);
        else
            System.out.println(false);
    }
}

