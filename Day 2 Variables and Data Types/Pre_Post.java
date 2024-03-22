public class Pre_Post {
    public static void main(String[] args) {
        int a = 11;
        int sum = a++ + ++a + a;
        System.out.println(sum);
    }
}
