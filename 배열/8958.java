package 배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main8958 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

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
           System.out.println(result);
           result = 0;
           cnt = 0;
        }
        bw.flush();
        bw.close();
    }
}
