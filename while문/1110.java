package while문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main1110 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine(); // 입력받은 숫자
        int n = Integer.parseInt(s); // 10보댜 작은 숫자 체크 및 정수화
        int i = 1;
        int x,y,z = 0;

        if(n < 10) { // 입력받은 숫자가 10보다 작으면 뒤에 0을 붙임
            s = 0 + s;
        }

        while(true) {
            i++;
            x = n/10;
            y = n%10;
            z = ((x+y)%10)*10;

            s = "" + z;
            n = Integer.parseInt(s);
            System.out.println(s);
            if(n == Integer.parseInt(s)) {
                break;
            }

            // String divinS1 = s.substring(0, 1); // 첫째자리
            // String divinS2 = s.substring(1, 2); // 둘째자리
            // int addDivinSOri = Integer.parseInt(divinS1) + Integer.parseInt(divinS2);
            // if(addDivinSOri < 10) {
            //     s = divinS2 + Integer.toString(addDivinSOri);
            //     if(Integer.parseInt(s) == n) {
            //         break;
            //     }
            // } else {
            //     s = divinS2 + Integer.toString(addDivinSOri).substring(1, 2);
            //     if(Integer.parseInt(s) == n) {
            //         break;
            //     }

            // }
            // i++;
            
        }
        bw.append(Integer.toString(i));
        bw.flush();
        bw.close();
    }
}
