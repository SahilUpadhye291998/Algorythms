import java.util.*;

public class BackSpaceCompare {
    public static void main(String[] args) {
        String input1 = "ab##";
        String input2 = "c#b#";
        Stack<Character> input1Stack = new Stack<Character>();
        Stack<Character> input2Stack = new Stack<Character>();
        String output1 = new String();
        String output2 = new String();
        for (int i = 0; i < input1.length(); i++) {
            if ((input1.charAt(i) == '#' && !input1Stack.isEmpty())) {
                input1Stack.pop();
                continue;
            }
            if (input1.charAt(i) == '#') {
                continue;
            }
            input1Stack.push(input1.charAt(i));
        }

        for (int i = 0; i < input2.length(); i++) {
            if (input2.charAt(i) == '#' && !input2Stack.isEmpty()) {
                input2Stack.pop();
                continue;
            }

            if (input2.charAt(i) == '#') {
                continue;
            }
            input2Stack.push(input2.charAt(i));
        }

        for (Character character : input1Stack) {
            output1 += character;
        }
        for (Character character : input2Stack) {
            output2 += character;
        }

        System.out.println(output1);
        System.out.println(output2);
        System.out.println(output1.equals(output2));
    }
}
