package for문;

import java.util.Scanner;

class Main2739 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        
        sc.close();

        for(int i = 1; i < 10; i++) {
            System.out.println(x + " * " + i +  " = " + x * i);
        }
    }
}