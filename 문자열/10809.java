package 문자열;

import java.io.BufferedReader;

// 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
// 첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.
// 입력 baekjoon
// 출력 1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1

import java.io.IOException;
import java.io.InputStreamReader;

class Main10809 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 알파벳 배열 생성
        int arr[] = new int[26];

        // 단어S 입력받기
        String s = br.readLine();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }

        for (int i = 0; i < s.length(); i++) {
            if(arr[s.charAt(i) - 'a'] == -1) {
                arr[s.charAt(i) - 'a'] = i;
            }
        }

        for(int i = 0; i < arr.length; i++) {
            sb.append(arr[i] + " ");
        }

        System.out.println(sb);

        // // s의 길이만큼 반목문을 돌며 배열에 값 더하기
        // for (int i = 0; i < s.length(); i++) {
        //     // 중복된 알파벳이 없을 시 arr[s.charAt(i) - 97]값 변경
        //     if(arr[s.charAt(i) - 97] == 0) {
        //         // (int)(s.charAt(i)) - 97 = a:0, b:1, c:2, d:3......... / + 1은 첫번째 값이 0이기 때문에 뒤에서 0을 -1로 치환할 때 구분할 수 있게 하기위해 더한다.
        //         // i = 단어s의 알파벳 위치 / 알파벳 위치를 배열에 넣어준다.
        //         arr[s.charAt(i) - 97] = i + 1;
        //     }
        // }

        // for (int i = 0; i < arr.length; i++) {
        //     // arr[i]가 0이면 -1로 변경
        //     if(arr[i] == 0) {
        //         arr[i] = -1;
        //     // 아니라면 위에서 더했던 1을 빼준다.
        //     } else {
        //         arr[i] = arr[i] -1;
        //     }

        //     sb.append(arr[i]  + " ");
        // }
        // System.out.println(sb);
    }
}
