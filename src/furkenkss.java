import java.util.Scanner;

public class furkenkss {
    public static void main(String[] args) {
            int x =0;
            Scanner input = new Scanner(System.in);
            x = input.nextInt();
            for (int i = 1; i <= x; i++) {
                for (int k = 1; k < i; k++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= 2 * x - (2 * i -1); j++) {
                    System.out.print("*");
                }
                System.out.println(" ");
        }
    }
}
