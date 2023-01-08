package sort;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class No11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int answer = 0;
        ArrayList<Integer> listA = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            listA.add(Integer.valueOf(st.nextToken()));
        }
        listA.sort(Comparator.reverseOrder());
        for (int i = 0; i < n; i++) {
            answer = answer + listA.get(i) * (i + 1);
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}
