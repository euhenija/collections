import java.util.Stack;

public class FlipTheNumber {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int number = 123;
        while (number > 0) {
            stack.push(number % 10);
            number = number / 10;
        }
        int revNumber = 0;
        int helper = 1;
        while (!stack.empty()) {
            revNumber=revNumber+stack.pop()*helper;
            helper=helper*10;
        }
        System.out.println(revNumber);
    }
}
