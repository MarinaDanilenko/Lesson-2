public class Lesson2Task4 {
    public static void main(String[] args) {
        int n = 287;
        int first_n = n / 100;
        int second_n = ((n / 10) % 10);
        int third_n = n % 10;
        int sum = first_n + second_n + third_n;
        System.out.println(sum);
    }
}
