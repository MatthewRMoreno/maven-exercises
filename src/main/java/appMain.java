import org.apache.commons.lang3.StringUtils;
import util.Input;

public class appMain {
    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("Enter something: ");
        String userInput = input.getString();
        System.out.println("You entered: '" + userInput + "'");
        StringUtils.isNumeric(userInput);
        if (!StringUtils.isNumeric(userInput)) {
            System.out.println("'" + userInput + "' is not a number");
        }else System.out.println("'" + userInput + "' is a number");;
        String newCase = StringUtils.swapCase(userInput);
        System.out.println("Flipped Case: " + newCase);
        String reverseString = StringUtils.reverse(userInput);
        System.out.println("Reversed: " + reverseString);
    }
}
