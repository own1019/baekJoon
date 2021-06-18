package 배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main8958 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        int result = 0;

        String arr[] = new String[n];

        for(int i=0; i<n; i++) {
            arr[i] = br.readLine();
           for(int j=0; j<arr[i].length(); j++) {
                if(arr[i].charAt(j) == 'O') {
                    cnt++;
                } else {
                    cnt = 0;
                }
                result = result + cnt;
           }
           sb.append(result).append('\n');
           result = 0;
           cnt = 0;
        }
        System.out.println(sb);
    }
}
