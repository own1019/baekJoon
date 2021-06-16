package 배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main3052 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean arr[] = new boolean[42];
        
        for(int i=0; i < 10; i++) {
            arr[Integer.parseInt(br.readLine()) % 42] = true; 
        }

        br.close();

        int count = 0;
        for(boolean a : arr){
            if(a) {
                count++;
            }
        }
        System.out.println(count);
    }
}
