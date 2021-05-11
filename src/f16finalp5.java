import java.util.Scanner;
import java.util.Stack;

public class f16finalp5 {
    public static void main(String[] args) {
    String test1 = "ahem. lamb little a had mary. snow as white was fleece its. end the.";
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input the sentence to print reversed of it.");
    printReversedSentences(scanner);
    }

    public static void printReversedSentences(Scanner in) {
        Stack<String> stack = new Stack<String>();
        String next;

        while (in.hasNext()) {
            next = in.next();

            // Check if it is the last word
            if (next.charAt(next.length()-1) == '.') {

                // Last word of the sentence
                stack.push(next.substring(0, next.length()-1));

                while (!stack.empty()) {
                    // Print word reversly
                    System.out.print(stack.pop());

                    // Print ". " or " "
                    if (stack.empty()) { System.out.print(". "); } else { System.out.print(" "); }
                }
            }

            // If it is not the last word, push into stack
            else { stack.push(next); }
        }
    }
}
