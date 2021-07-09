package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
// 첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
// 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.

class Main1157 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int arr[] = new int[26];
        int maxNum = -1;
        int cnt = 0;
        String inputString = br.readLine();

        // 입력된 문자열 각 자리의 알파벳의 바이트를 가져온다.
        for (byte value : inputString.getBytes()) {
            //A = 65,  Z = 90 / a = 97, z = 122
            if(value >= 97) {
                value -= 97;
            } else {
                value -= 65;
            }
            arr[value]++;
        }

        int n = 0;
        for(int i = 0; i <= 25; i++) {
            if(arr[i] > n) {
                n = arr[i];
                maxNum = i;
            }
        }

        for (int i = 0; i <= 25; i++) {
            if(n == arr[i]) {
                cnt++;
            }
        }

        if(cnt > 1) {
            System.out.println('?');
        } else {
            System.out.println((char)(maxNum+65));
        }
    }
}
