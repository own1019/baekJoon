package 배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main2577 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = 1; // 카운트
        int j = 1;
        int a = Integer.parseInt(br.readLine()); // 첫번째 입력 숫자
        int b = Integer.parseInt(br.readLine()); // 두번째 입력 숫자
        int c = Integer.parseInt(br.readLine()); // 세번째 입력 숫자

        int zero = 0;
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int six = 0;
        int seven = 0;
        int eight = 0;
        int nine = 0;


        int result = a * b * c;
        String s = Integer.toString(result);

        while(true) {
            if(result/10 != 0) {
                result = result/10;
                n++;
            } else {
                break;
            }
        }

        for(int i=0; i<n; i++) {
            String str = s.substring(i, (i+1));
            if(Integer.parseInt(str) == 0) {
                zero++;
            } else if(Integer.parseInt(str) == 1) {
                one++;
            } else if(Integer.parseInt(str) == 2) {
                two++;
            } else if(Integer.parseInt(str) == 3) {
                three++;
            } else if(Integer.parseInt(str) == 4) {
                four++;
            } else if(Integer.parseInt(str) == 5) {
                five++;
            } else if(Integer.parseInt(str) == 6) {
                six++;
            } else if(Integer.parseInt(str) == 7) {
                seven++;
            } else if(Integer.parseInt(str) == 8) {
                eight++;
            } else if(Integer.parseInt(str) == 9) {
                nine++;
            }
        }

        bw.write(Integer.toString(zero) + "\n");
        bw.write(Integer.toString(one) + "\n");
        bw.write(Integer.toString(two) + "\n");
        bw.write(Integer.toString(three) + "\n");
        bw.write(Integer.toString(four) + "\n");
        bw.write(Integer.toString(five) + "\n");
        bw.write(Integer.toString(six) + "\n");
        bw.write(Integer.toString(seven) + "\n");
        bw.write(Integer.toString(eight) + "\n");
        bw.write(Integer.toString(nine));

        bw.flush();
        bw.close();
        br.close();
    }
}
