package if문;

import java.util.Scanner;

class Main1330 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        sc.close();

        int a = Integer.parseInt(str.split(" ")[0]);
        int b = Integer.parseInt(str.split(" ")[1]);

        if(a > b) {
            System.out.println('>');
        } else if(a < b) {
            System.out.println('<');
        } else {
            System.out.println("==");
        }

        
    }
}