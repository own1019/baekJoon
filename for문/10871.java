package for문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Main10871 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st0 = new StringTokenizer(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int sequenceCnt = Integer.parseInt(st0.nextToken());
        int underNumber = Integer.parseInt(st0.nextToken());
        for(int i=1; i<=sequenceCnt; i++) {
            int x = Integer.parseInt(st1.nextToken());
            if(underNumber > x) {
                bw.write(Integer.toString(x) + " ");
            }
        }
        bw.flush();
        bw.close();
    }
}
