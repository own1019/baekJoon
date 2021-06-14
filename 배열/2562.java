package 배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main2562 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nCnt = 0;
        int a = 0; // 값의 비교가 될 처음 값
        String[] s = new String[9];

        for(int i=0; i<9; i++) {
            s[i] = br.readLine();
        }

        // 비교값 기준 - 배열의 첫번째 값
        a = Integer.parseInt(s[0]);
        for(int i=0; i<s.length; i++) {
            if(a <= Integer.parseInt(s[i])) { // i번째 배열이 비교기준보다 크거나 같다면
                a = Integer.parseInt(s[i]); //해당 배열값을 b에 입력
                nCnt = i+1;
            }
        }

        System.out.println(a);
        System.out.println(nCnt);
        
        br.close();
    }
}
