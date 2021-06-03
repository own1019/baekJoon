package 입출력과사칙연산;

import java.util.Scanner;

class Main2588 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        sc.close();

        System.out.println((b%10) * a);
        System.out.println((b%100/10 * a));
        System.out.println((b/100) * a);
        System.out.println(a * b);
    }
}
