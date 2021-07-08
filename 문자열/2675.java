package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//  문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오.
//  즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. S에는 QR Code "alphanumeric" 문자만 들어있다. 
// QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.

class Main2675 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int repeatNum = 0;
        String s = "";

        //테스트케이스 갯수 입력
        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            // 문자열 s 입력, 반복횟수, 문자열 입력. 공백으로 반복횟수와 문자열을 구분한다.
            st = new StringTokenizer(br.readLine());
            repeatNum = Integer.parseInt(st.nextToken()); // 반복횟수
            s = st.nextToken(); // 문자열

            // 문자열의 길이 만큼 반복
            for (int j = 0; j < s.length(); j++) {
                for(int k = 0; k < repeatNum; k++) {
                    sb.append(s.charAt(j));
                }
            }
            sb.append('\n');

        }
        System.out.println(sb);
    }
}
