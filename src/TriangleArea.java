import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        System.out.println("Enter coordinates :");
        Scanner scanner = new Scanner (System.in);
        int xA= scanner.nextInt();
        int yA=scanner.nextInt();
        int xB=scanner.nextInt();
        int yB=scanner.nextInt();
        int xC=scanner.nextInt();
        int yC=scanner.nextInt();
        double triangleArea = (xA * (yB - yC) + xB * (yC - yA) + xC * (yA - yB)) / 2;
        System.out.print(triangleArea);

    }
}
