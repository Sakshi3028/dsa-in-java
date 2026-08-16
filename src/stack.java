import java.util.Stack;
public class stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
         stack.push(84);
          stack.push(24);
           stack.push(94);
            stack.push(54);

            System.out.println(stack.pop());
             System.out.println(stack.pop());
              System.out.println(stack.pop());
               System.out.println(stack.pop());
                System.out.println(stack.pop());
        }
}
