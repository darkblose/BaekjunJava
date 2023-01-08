package sort;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class No11931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> listA = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            listA.add(Integer.valueOf(br.readLine()));
        }
        listA.sort(Comparator.reverseOrder());
        for (Integer a : listA) {
            bw.write(a + "\n");
        }
        bw.flush();
        bw.close();
    }
}
