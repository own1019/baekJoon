package for문;

import java.util.Scanner;

class Main10950 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int testCaseCnt = sc.nextInt();
        
        for(int i = 0; i < testCaseCnt; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a+b);
        }

        sc.close();
        
    }
}
