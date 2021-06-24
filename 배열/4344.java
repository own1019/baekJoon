package 배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main4344 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int count = Integer.parseInt(br.readLine());
        
        for(int i=0; i<count; i++) {
            float point = 0;
            float pointAvg = 0;
            float higherThenAvg = 0;

            st = new StringTokenizer(br.readLine(), " ");
            int arr[] = new int[Integer.parseInt(st.nextToken())];
            for(int j=0; j<arr.length; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
                    point = point+arr[j];
            }
            pointAvg = point / arr[0];
            for(int k=1; k<arr.length; k++) {
                if(arr[k] > pointAvg) {
                    higherThenAvg++;
                }
            }
            sb.append(String.format("%.3f", higherThenAvg / arr[0] * 100) + "%");
        }
    }
}