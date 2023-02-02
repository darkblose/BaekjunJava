package com.algorithm.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class No1213 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        String answer = solution(name);
        System.out.println(answer);
    }

    public static String solution(String name) {
        List<String> letter = transformingStringList(name);
        String result = checkRequiredForPalindrome(letter);
        if (result.equals("false")) {
            return "I'm Sorry Hansoo";
        }
        return makingPalindrome(letter, result);
    }

    private static List<String> transformingStringList(String name) {
        List<String> letter = new ArrayList<>();
        for (int i = 0; i < name.length(); i++) {
            letter.add(name.substring(i, i + 1));
        }
        letter.sort(Comparator.naturalOrder());
        return letter;
    }

    private static String checkRequiredForPalindrome(List<String> letter) {
        HashSet<String> nameSet = new HashSet<>(letter);
        if (letter.size() % 2 == 0) {
            for (String s : nameSet) {
                if (Collections.frequency(letter, s) % 2 == 1) {
                    return "false";
                }
            }
            return "";

        } else {
            int count = 0;
            String singleLetter = "";
            for (String s : nameSet) {
                int frequency = Collections.frequency(letter, s);
                if (frequency % 2 == 1) {
                    count = count + 1;
                    singleLetter = s;
                }
                if (count > 1) {
                    return "false";
                }
            }
            if (count == 1) {
                return singleLetter;
            }
        }
        return "false";
    }

    private static String makingPalindrome(List<String> letterList, String result) {
        String[] answerArray = new String[letterList.size()];
        if (letterList.size() % 2 == 1) {
            answerArray[letterList.size() / 2] = result;
            letterList.remove(result);
        }
        Queue<String> letterPq = new PriorityQueue<>(letterList);
        int i = 0;
        while (!letterPq.isEmpty()) {
            answerArray[i] = letterPq.remove();
            answerArray[answerArray.length - 1 - i] = letterPq.remove();
            i++;
        }
        return String.join("", answerArray);
    }
}
