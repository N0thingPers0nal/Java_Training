package Tasks;

import java.util.Scanner;

public class Charater_Count {
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        Scanner scanner=new Scanner(System.in);
        String string=scanner.next();
        System.out.print("Which Character count occurence needed? : ");
        String character=scanner.next();
        int count=0;
        for(int i=0;i<string.length();i++){
            if(string.charAt(i)==character.charAt(0)){
//                System.out.println(string.charAt(i));
                count+=1;
            }
        }
        System.out.println(count);
//        System.out.println(string+" " +character);
    }

}
