public class recurtionWithJava {
    public static void main(String[] args) {
        int result = summation(10);
        System.out.println(result);
    }

    public static int summation(int k) {
        if (k > 0) {
            return k + summation(k - 1);
        } else {
            return 0;
        }
    }
}
