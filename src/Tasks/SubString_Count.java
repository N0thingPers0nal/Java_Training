package Tasks;

import java.util.Scanner;

public class SubString_Count {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string=scanner.nextLine();
        System.out.print("Enter a SubString: ");
        String subString=scanner.next();
        int count=0;
        String temp=string.replace(subString,"1"),cout="1";
        for(int i=0;i<temp.length();i++){
            if(temp.charAt(i)==cout.charAt(0)){
                count+=1;
            }
        }
        System.out.println(count);
//         string=string.replaceAll("[subString.toCharArray()]","1");
//        string= String.valueOf(string.matches(subString));
//        string=string.replaceFirst(subString.charAt(0),"");
//        System.out.println(string.indexOf(subString,0));

    }
}
