public class SwapWithoutTemp {
    public static void main(String[] args) {
        int a = 5, b = 10;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
