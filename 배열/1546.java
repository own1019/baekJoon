package 배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main1546 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int arr[] = new int[1000];
        int n = Integer.parseInt(br.readLine());
        float max = 0;
        float result = 0;
        float addResult = 0;
        st = new StringTokenizer(br.readLine());
        for(int i=0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i < n; i++) {
            if(max < arr[i] ) {
                max = arr[i];
            }
        }

        for(int i=0; i < n; i++) {
            result = arr[i] / max * 100;
            addResult  = addResult + result;
        }

        float avg = addResult/n;

        System.out.println(avg);
    }
}
