import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        System.out.println("Enter the sides of rectangle:");
        Scanner in =new Scanner(System.in);
        int a = in.nextInt();
        int b =in.nextInt();
        int area = a*b;
        System.out.println("The area is: "+area);
    }
}

