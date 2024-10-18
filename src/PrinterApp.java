public class PrinterApp {
    public static void main(String[] args) {
        // Title of the program
        System.out.println("Printer App");
        
        System.out.print("This app is made by: ");
        String creator = "Shohel";
        System.out.println(creator);
        
        //initiated the variables
        double number1 = 12;
        double number2 = 10;
        // System.out.println(number1);
        System.out.println("The value of number1 is " + number1);
        System.out.println("The value of number2 is " + number2);

        //multiplication
        double multiplication;
        multiplication = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + multiplication);

        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double division = number1 / number2;

        System.out.println(number1 + " + " + number2 + " = " + addition);
        System.out.println(number1 + " - " + number2 + " = " + subtraction);
        System.out.println(number1 + " / " + number2 + " = " + division);

    }
}
