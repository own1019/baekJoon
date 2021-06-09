package while문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Main1095 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = "";
        while ((s=br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(s);
            if(st.hasMoreTokens()) {
                int n = Integer.parseInt(st.nextToken());
                int m = Integer.parseInt(st.nextToken());
                if(n+m == 0) {
                    break;
                } else {
                    bw.append(n+m + "\n");
                }
            } else {
                break;
            }
        }
        bw.flush();
        bw.close();

    }
}
