import java.util.Scanner;

public class DecimalToBase7 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int i = in.nextInt();
        System.out.println(Integer.toString(i,7));
    }
}
