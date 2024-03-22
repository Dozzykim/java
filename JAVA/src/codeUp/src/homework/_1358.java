package homework;

import java.util.Scanner;

public class _1358 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int i = 1; i <= (n/2+1); i++) {
            for (int j = n/2; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i-1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();
    }
}