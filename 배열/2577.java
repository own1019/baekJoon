package 배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main2577 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int result = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
        int[] arr = new int[10];

        while(result != 0) {
            arr[result%10]++;
            result/=10;
        }

        for(int val : arr) {
			System.out.println(val);
		}

        br.close();
    }
}
