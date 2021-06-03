package 입출력과사칙연산;

import java.util.Scanner;

class Main1000 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        scanner.close();

        System.out.println(a + b);
    }
}