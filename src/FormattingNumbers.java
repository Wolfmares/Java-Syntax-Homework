import java.util.Scanner;


public class FormattingNumbers {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int a = in.nextInt();
        double b = in.nextDouble();
        double c = in.nextDouble();
        System.out.print('|');
        System.out.print(String.format("%1$-10s", Integer.toHexString(a).toUpperCase()));
        System.out.print('|');
        System.out.print(Integer.toBinaryString(a));
        System.out.print('|');
        System.out.print(String.format("%1$10s", String.format("%.2f", b)));
        System.out.print('|');
        System.out.print(String.format("%1$-10s", String.format("%.3f", c)));
        System.out.print('|');
    }
}
