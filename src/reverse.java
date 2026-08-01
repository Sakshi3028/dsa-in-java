public class reverse {

    public static void main(String[] args) {
        int n=12345;
        System.out.println("Reverse of " + n + " is: " + reverse(n));
    }
    
    static int reverse(int n) {
        int reversed = 0;
        while (n != 0) {
            int rem= n % 10;
            reversed = reversed * 10 + rem;
            n /= 10;
        }
        return reversed;
    }
}
