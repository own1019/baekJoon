package while문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

    class Main1110 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine(); // 입력받은 숫자
        int N = Integer.parseInt(s);
        int copy = N;		//변수 복사
        int count = 0;
        
        while(true){
            N = ((N%10)*10) + ((N/10 + N%10)%10);
            System.out.println(N);
            count++;
        
            if(copy == N){
                break;
            }
        }
        System.out.println(count);
    }
}
