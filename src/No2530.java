import java.util.Scanner;

public class No2530 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int m = scanner.nextInt();
        int s = scanner.nextInt();
        int cooking_time = scanner.nextInt();

        int add_s = cooking_time % 60;
        int add_m = (cooking_time / 60) % 60;
        int add_h = cooking_time / 3600;

        s = s + add_s;
        if(s>=60) {
            m = m + (s / 60);
            s = s % 60;

        }

        m = m + add_m;
        if (m>=60) {
            h = h + (m / 60);
            m = m % 60;

        }

        h = h + add_h;
        if (h>=24) {
            h = h % 24;
        }

        System.out.printf("%d %d %d",h,m,s);
    }
}
