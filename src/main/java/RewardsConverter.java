import java.util.Scanner;

public class RewardsConverter {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Welcome to the Credit Card Rewards Converter!");
        System.out.println("Please pick one of the option below: \n 1. convert miles to Cash Value \n 2. convert cash to Miles worth ");
        var isMiles = scanner.nextInt();
        while (isMiles != 1 && isMiles != 2) {
            System.out.println("Please pick again!");
            isMiles = scanner.nextInt();
        }
        if(isMiles == 1) {
            System.out.println("Please enter a miles value to convert to cash: ");
        } else {
            System.out.println("Please enter a cash value to convert to airline miles: ");
        }
        var input_value = scanner.next();
        double valueToConvert;
        try {
            valueToConvert = Double.parseDouble(input_value);
        } catch (NumberFormatException exception) {
            System.out.println("Could not parse input value as a double, exiting");
            return;
        }
        if(isMiles == 1) {
            System.out.println("converting" + input_value + " miles" + " to cash");
            var rewardsValue = new RewardValue(valueToConvert, isMiles);
            System.out.println(input_value + " miles are worth " + "$" + String.format("%.2f", rewardsValue.getCashValue()));
        } else {
            System.out.println("converting $" + input_value + " to miles");
            var rewardsValue = new RewardValue(valueToConvert);
            System.out.println("$" + input_value + " is worth " +String.format("%.2f", rewardsValue.getMilesValue()) + " miles");
        }
    }
}