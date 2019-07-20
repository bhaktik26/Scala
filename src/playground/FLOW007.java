package playground;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FLOW007 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t--!=0) {
            int n = Integer.parseInt(br.readLine());
            String str = String.valueOf(n);
            String sb = new StringBuilder(str).reverse().toString();
            while (sb.startsWith("0")) {
                sb = sb.replaceFirst("0", "");
            }
            System.out.println(sb);
        }
    }
}
