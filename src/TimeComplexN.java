public class TimeComplexN {
    public static void main(String[] args) {
        int FindNumber = (int) (Math.random() * 100);
        for (int i = 0; i < 100; i++) {
            if (i == FindNumber) {
                System.out.println(i);
                break;
            }
        }
    }
}
