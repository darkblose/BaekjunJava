package sort;

import java.io.*;
import java.util.*;

public class No1026 {
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            listA.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            listB.add(Integer.parseInt(st.nextToken()));
        }

//        int answer = methodBySort(listA, listB);
        int answer = methodByMinMax(listA, listB);

        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }

    private static int methodBySort(List<Integer> listA, List<Integer> listB) {
        listA.sort(Comparator.naturalOrder());
        listB.sort(Comparator.reverseOrder());

        int answer = 0;
        for (int i = 0; i < n; i++) {
            answer = answer + listA.get(i) * listB.get(i);
        }
        return answer;
    }

    private static int methodByMinMax(List<Integer> listA, List<Integer> listB) {
        int answer = 0;
        for (int i = 0; i < n; i++) {
            int minA = Collections.min(listA);
            int maxB = Collections.max(listB);
            answer = answer + minA * maxB;
            listA.remove(Integer.valueOf(minA));
            listB.remove(Integer.valueOf(maxB));
        }
        return answer;
    }
}
