import java.util.Scanner;

public class InteractRunner {
    public static void main (String[] args){
        Scanner reader = new Scanner(System.in);
        try{
            Calculator calc = new Calculator();
            String exit = "n";
            String saveres = "n";
            int first, second;
            while (!exit.equals("y")){
                if (saveres.equals("y")) {
                    System.out.println("You choose to use last result as new argument.");
                    first = calc.getResult();
                } else {
                    System.out.println("Enter first arg: ");
                    first = Integer.valueOf(reader.next());
                }
                System.out.println("Enter second arg: ");
                second = Integer.valueOf(reader.next());
                System.out.println("Enter operation (+, -, *, /, ^): ");
                String operand = reader.next();
                switch(operand) {
                    case "+":
                        calc.add(first, second);
                        break;
                    case "-":
                        calc.substr(first, second);
                        break;
                    case "*":
                        calc.mult(first, second);
                        break;
                    case "/":
                        calc.divis(first, second);
                        break;
                    case "^":
                        calc.expon(first, second);
                        break;
                    default:
                        System.out.println("Operation unavailable!");
                        break;
                }
                System.out.println(first + " " + operand + " " + second + " = "+ calc.getResult());
                System.out.println("Do you want to exit? (y/n): ");
                exit = reader.next();
                if (!exit.equals("y")) {
                    System.out.println("Do you want to use result in a new operation? (y/n): ");
                    saveres = reader.next();
                }
            }
        } finally {
            reader.close();
        }
    }
}