package mavenmain;

import org.apache.commons.lang3.StringUtils;
import util.Input;

public class appMain {
    public static void main(String[] args) {
        //new input
        Input input = new Input();
        System.out.println("Enter something: ");
        //store the input as userInput
        String userInput = input.getString();
        System.out.println("You entered: '" + userInput + "'");
        //Check if the input is a numeric value
        StringUtils.isNumeric(userInput);
        if (!StringUtils.isNumeric(userInput)) {
            System.out.println("'" + userInput + "' is not a number");
        }else System.out.println("'" + userInput + "' is a number");;
        //Swap the case for the userInput
        String newCase = StringUtils.swapCase(userInput);
        System.out.println("Flipped Case: " + newCase);
        //Reverse the userInput string
        String reverseString = StringUtils.reverse(userInput);
        System.out.println("Reversed: " + reverseString);
        //No whitespace
        System.out.println("No whitespace: " + StringUtils.deleteWhitespace(userInput));
    }
}
