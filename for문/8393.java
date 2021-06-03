package for문;

import java.util.Scanner;

class Main8393 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.close();

        int x = 0;

        for(int i = 1; i <= n; i++) {
            x = x + i;
        }

        System.out.println(x);
        
    }
}
