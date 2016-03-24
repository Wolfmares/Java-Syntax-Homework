import java.util.Scanner;

public class Base7ToDecimal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int base7Number = Integer.parseInt(in.nextLine(), 7);
        String decimalNumber = Integer.toString(base7Number, 10);

        System.out.println(decimalNumber);
    }
}
