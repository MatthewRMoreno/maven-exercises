package util;
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Input scanner = new Input();
        String getString = scanner.getString();
        System.out.println(getString);
        boolean yesNo = scanner.yesNo();
        System.out.println(yesNo);
        int getInt = scanner.getInt(1, 10);
        System.out.println(getInt);
        System.out.println(scanner.getInt());
        double getDouble = scanner.getDouble(1, 20);
        System.out.println(getDouble);
    }

    private Scanner scanner = new Scanner(System.in);

    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("yes or no?: ");
        String userInput = getString();
        if(userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")){
            return true;
        }else {
            return false;
        }
    }
//hasnextint for scanner
    public int getInt(int min, int max) {
//        boolean userInput = scanner.hasNextInt();
        int userVal = getInt();
        if ( userVal >= min && userVal <= max) {
            return userVal;
        } else {
            System.out.println( userVal + " is not between " + min + "-" + max);
            return getInt(min, max);
        }
    }

    public int getInt() {
        while (true) {
            String userInput = getString();
            try {
                int userInt = Integer.parseInt(userInput);

                return userInt;
            } catch (NumberFormatException e) {
                System.out.println("This isn't int");
            }
        }
    }

    public double getDouble(double min, double max) {
        System.out.println("Please enter a decimal number between " + min + "-" + max);
        double userInput = getDouble();
        if (userInput >= min && userInput <= max) {
            scanner.nextLine();
            return userInput;
        }
        else
            System.out.println("Double is not between " + min + " and " + max + ", Enter another double:");
        return getDouble(min, max);
    }

    public double getDouble() {
            String userInput = getString();
            try {
                double userDbl = Double.parseDouble(userInput);

                return userDbl;
            } catch (NumberFormatException e) {
                System.out.println("This isn't a double");
            }
            return getDouble();
    }
}