package playground;

import scala.Int;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TLG {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int scores[][] = new int[n][2];
        StringTokenizer tk;
        int i = 0;
        int winner = 0;
        int lead = 0;
        while(n--!=0) {
            tk = new StringTokenizer(br.readLine());
            scores[i][0] = Integer.parseInt(tk.nextToken());
            scores[i][1] = Integer.parseInt(tk.nextToken());
            i++;
        }
        for(int j=0; j<scores.length; j++) {
            if(scores[j][0] - scores[j][1] > lead) {
                lead = scores[j][0] - scores[j][1];
                winner = 1;
            }
            if(scores[j][1] - scores[j][0] > lead) {
                lead = scores[j][1] - scores[j][0];
                winner = 2;
            }
        }
        System.out.println(winner + " " + lead);
    }
}
