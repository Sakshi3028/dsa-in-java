public class digitsum {
    public static void main(String[] args) {
        int n=12345;
        System.out.println("Sum of digits of " + n + " is: " + sum(n));
}
static int sum(int n){
    if(n==0){
        return 0;
    }
    return (n%10)+sum(n/10);
}
}