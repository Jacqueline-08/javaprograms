public class SwapWithTemp {
    public static void main(String[] args) {
        int a = 5, b = 10;
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
