import java.util.Scanner;

class Main2884 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();

        int x = Integer.parseInt(a.split(" ")[0]);
        int y = Integer.parseInt(a.split(" ")[1]);

        sc.close();

        if(y - 45 < 0) {
            if(x == 0) {
                x = 23;
            } else {
                x = x -1;
            }
            
            y = (60 + (y - 45));
            System.out.print(x + " " + y);
        } else {
            y = y - 45;
            System.out.print(x + " " + y);
        }
    }
}
