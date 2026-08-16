public class Stackmain {
    public static void main(String[] args) {
        try {
            customstack stack = new customstack(5);

            stack.push(34);
            stack.push(45);
            stack.push(2);
            stack.push(9);
            stack.push(15);

            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}