import java.util.Stack;

public class FlipTheNumber {
    public static void main(String[] args) {
        Stack stack = new Stack();
        int number = 123;
        char[] numbers = String.valueOf(number).toCharArray();

        for (char num : numbers) {
            stack.push(num);
        }

        while (!stack.empty()) {
            System.out.print(stack.pop());
        }

    }
}
