package 입출력과사칙연산;

import java.util.Scanner;

class Main1008 {
    public static void main(String args[]) {
        Scanner sc  = new Scanner(System.in);

        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = a/b;
        
        sc.close();

        System.out.println(c);
    }
}
