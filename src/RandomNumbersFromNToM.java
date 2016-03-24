import java.util.Random;
import java.util.Scanner;

public class RandomNumbersFromNToM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numN = scanner.nextInt();
        int numM = scanner.nextInt();
        int min = Math.min(numN, numM);
        int max = Math.max(numN, numM);
        Random random = new Random();
        for (int i = min; i <= max; i++) {
            int randomNum = random.nextInt((max - min) + 1) + min;
            System.out.print(randomNum + " ");
        }
    }
}