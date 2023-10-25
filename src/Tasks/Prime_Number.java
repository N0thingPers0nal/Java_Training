package Tasks;

public class Prime_Number {
    public static void main(String[] args) {
        System.out.print(2 + " ");
        for (int i = 2; i <= 100; i++) {
            int number = 0;
            for (int j = 2; j <= (i / 2) + 1; j++) {
                if (i % j == 0) {
                    number += 1;
//                    System.out.println(i + "- " + number);
                }
            }
            if (number <= 0) System.out.print(i + " ");
        }
    }
}
