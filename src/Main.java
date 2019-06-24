import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter formula: ");
        String formula = input.nextLine();

        char[] operators = {'+', '-', '*', '/'};
        char operator = ' ';
        List<Character> opesList = new ArrayList<Character>();
        for (char each : operators) {
            opesList.add(each);
        }


        int opeIdx = 0;
        for (int i = 0; i < formula.length(); i++) {
            if (opesList.indexOf(formula.charAt(i)) != -1) {
                operator = formula.charAt(i);
                opeIdx = i;
                break;
            }
        }
        Double firstNum = Double.parseDouble(formula.substring(0, opeIdx));
        Double secondNum = Double.parseDouble(formula.substring(opeIdx + 1,formula.length()));

        double answer = 0;
        if (operator == '+') {
            answer = firstNum + secondNum;
        } else if (operator == '-') {
            answer = firstNum - secondNum;
        } else if (operator == '*') {
            answer = firstNum * secondNum;
        } else {
            answer = firstNum / secondNum;
        }

        System.out.println("The result is " + answer);

    }
}
