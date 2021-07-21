package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//예전에는 운영체제에서 크로아티아 알파벳을 입력할 수가 없었다. 따라서, 다음과 같이 크로아티아 알파벳을 변경해서 입력했다.
//크로아티아 알파벳	변경
//č	c=
//ć	c-
//dž	dz=
//đ	d-
//lj	lj
//nj	nj
//š	s=
//ž	z=
// 예를 들어, ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다. 단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
// dž는 무조건 하나의 알파벳으로 쓰이고, d와 ž가 분리된 것으로 보지 않는다. lj와 nj도 마찬가지이다. 위 목록에 없는 알파벳은 한 글자씩 센다.

class Main2941 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int length = s.length();
        int arr[] = new int[length];
        int cnt = 0;
        int index = 0;

        for(int value : s.getBytes()) {
            arr[index] = value;
            if(index > 1 && value == '=' && arr[index-1] == 'z' && arr[index-2] == 'd') {
                cnt += 2;
            } else if(index > 0 && value == '-') {
                if(arr[index-1] == 99 || arr[index-1] == 100) {
                    cnt++;
                }
            } else if(index > 0 && value == '=') {
                if(arr[index-1] == 'c' || arr[index-1] == 's' || arr[index-1] == 'z') {
                    cnt++;
                }
            } else if(index > 0 && value == 'j') { // j일때
                if(arr[index-1] == 108 || arr[index-1] == 110) {
                    cnt++;
                }
            }
            index++;
        }
        System.out.println(length-cnt);
    }
}
