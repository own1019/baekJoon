package 문자열;

// N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
// 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main11720 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = 0;
        String s = br.readLine();


        for (int i = 0; i < n; i++) {
            m += (int)s.charAt(i);
        }
        System.out.println(m);

        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // br.readLine();
        // int sum = 0;

        // for (byte value : br.readLine().getBytes()) {
        //     sum += (value - '0');
        // }
        // System.out.println(sum);
    }
}
