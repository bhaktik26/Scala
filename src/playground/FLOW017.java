package playground;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class FLOW017 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int a[] = new int[3];
        while(t-- != 0) {
            int max, temp;
            StringTokenizer tk = new StringTokenizer(br.readLine());
            a[0] = Integer.parseInt(tk.nextToken());
            a[1] = Integer.parseInt(tk.nextToken());
            a[2] = Integer.parseInt(tk.nextToken());
            Arrays.sort(a);
            System.out.println(a[1]);
        }

    }
}
