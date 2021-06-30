package 함수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main1065 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 0;

        if(n < 100) {
            result = n;
        } else {
            result = 99;
            for(int i = 100; i <= n; i++) {
                int hen = i / 100;
                int ten = (i / 10) % 10;
                int one = i % 10;

                if((hen-ten) == (ten-one)) {
                    result++;
                }
            }            
        }
        System.out.println(result);
    }
}
