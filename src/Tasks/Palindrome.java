package Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.next();
        char str[]= name.toCharArray();
        String reverseString="";
        for(int i=str.length-1;i>=0;i--){
            reverseString = reverseString + str[i];
        }
//        System.out.println(name+" "+reverseString);
//        if(reverseString == name){
        System.out.println(reverseString.equals(name));}

}
