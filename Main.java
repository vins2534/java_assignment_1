/*
Vinit Samani
22070126097
AIML B1
*/
public class Main {
    public static void main(String[] args) {
        // Create an instance of UserInput to handle user input
        UserInput userInput = new UserInput();
        
        // Get the user's choice of operation
        String choice = userInput.getStringInput("Choose Operation: add, sub, div, mult, power, variance, stddev, avg");

        // Check if the chosen operation is a basic arithmetic operation (+, -, *, /, ^)
        if (choice.equals("add") || choice.equals("sub") || choice.equals("mult") || choice.equals("div") || choice.equals("power")) {
            // Get user input for two numbers
            double n1 = userInput.getDoubleInput("Enter First Number:");
            double n2 = userInput.getDoubleInput("Enter Second Number:");
            userInput.closeScanner(); // Close the scanner since input is complete
            
            // Perform the chosen operation and display the result
            if (choice.equals("add")) {
                System.err.println(Calculator.add(n1, n2));
            } else if (choice.equals("sub")) {
                System.err.println(Calculator.subtract(n1, n2));
            } else if (choice.equals("mult")) {
                System.err.println(Calculator.multiply(n1, n2));
            } else if (choice.equals("div")) {
                System.out.println(Calculator.divide(n1, n2));
            } else if (choice.equals("power")) {
                System.out.println(Calculator.power(n1, n2));
            } else {
                System.out.println("Invalid Operation");
            }
        } else {
            // For statistical operations (var, stddev, avg), get an array input
            double[] arr = userInput.getArrayInput();
            userInput.closeScanner(); // Close the scanner since input is complete
            
            // Perform the chosen statistical operation and display the result
            if (choice.equals("variance")) {
                System.out.println(Calculator.variance(arr));
            } else if (choice.equals("stddev")) {
                System.out.println(Calculator.stddev(arr));
            } else if (choice.equals("avg")) {
                System.out.println(Calculator.mean(arr));
            } else {
                System.out.println("Invalid Operation");
            }
        }
    }
}