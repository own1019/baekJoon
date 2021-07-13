package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/5622

class Main5622 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 2 : abc 3초걸림
        // 3 : def
        // 4 : ghi
        // 5 : jkl
        // 6 : mno
        // 7 : pqrs
        // 8 : tuv
        // 9 : wxyz
        int arr[] = new int[26];
        int time = 0;

        for(byte value : br.readLine().getBytes()) {
            arr[value-65]++;
        }

        for (int i = 0; i < arr.length; i++) {
            if(i < 3) {
                time += arr[i] * 3;
            } else if(i < 6) {
                time += arr[i] * 4;
            } else if(i < 9) {
                time += arr[i] * 5;
            } else if(i < 12) {
                time += arr[i] * 6;
            } else if(i < 15) {
                time += arr[i] * 7;
            } else if(i < 19) {
                time += arr[i] * 8;
            } else if(i < 22) {
                time += arr[i] * 9;
            }  else if(i < 26) {
                time += arr[i] * 10;
            }
        }

        System.out.println(time);
    }
}
