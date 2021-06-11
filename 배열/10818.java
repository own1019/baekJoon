package 배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main10818 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = 0; // 값의 비교가 될 처음 값
        int b = 0; // 값의 비교가 될 처음 값
        
        String[] arr = new String[n]; // n만큼 배열생성

        // 배열에 입력값 입력
        for(int i=0; i<n; i++) {
            arr[i] = st.nextToken();
        }

        // 비교값 기준 - 배열의 첫번째 값
        a = Integer.parseInt(arr[0]);
        b = Integer.parseInt(arr[0]);
        for(int i=0; i<n; i++) {
            if(a >= Integer.parseInt(arr[i])) { // i번째 배열이 비교기준보다 작거나 같다면 
                a = Integer.parseInt(arr[i]); //해당 배열값을 a에 입력
            } else if(b <= Integer.parseInt(arr[i])) { // i번째 배열이 비교기준보다 크거나 같다면 
                b = Integer.parseInt(arr[i]); //해당 배열값을 b에 입력
            }
        }
        System.out.println(a + " " + b);
        
        br.close();
    }
}
