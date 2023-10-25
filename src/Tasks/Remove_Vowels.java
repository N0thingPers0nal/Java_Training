package Tasks;

import java.util.Scanner;

public class Remove_Vowels {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
//        String strNew = string.replaceAll("([a,e,i,o,u])", "");
//        System.out.println(strNew);
        String vowels = "aeiou";
        String string1 = "";
        int a = 0;
        for (int i = 0; i < string.length(); i++) {
//            System.out.print(string.charAt(i)+" ");
            for (int j = 0; j <= vowels.length() - 1; j++) {
//                System.out.print(vowels.charAt(j)==string.charAt(i));
                if (string.charAt(i) == vowels.charAt(j)) {
                    a = 1;
                }
            }
            if (a == 0) {
                string1 += string.charAt(i);
            }
            a = 0;
        }
        System.out.println(string1);
    }
}
