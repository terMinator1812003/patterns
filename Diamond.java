import java.util.*;

public class Diamond {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // 1st upper half
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // 2nd upper half
            for (int j = 2; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // 1st upper half
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // 2nd upper half
            for (int j = 2; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
