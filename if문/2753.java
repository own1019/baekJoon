package if문;

import java.util.Scanner;

class Main2753 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();

        sc.close();
        
        if(a % 4 == 0 &&  a % 100 != 0 || a % 400 == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
