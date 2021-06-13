public class SimpliArithmatic {
    
    public double addition(double num1, double num2){
        return num1 + num2;
    }
    
    public double subtraction(int num1, int num2){
        return num1 - num2;
    }
    
    public double multiplication(int num1, int num2){
        return num1 * num2;
    }
    
    public double division(int num1, int num2){
        return num1 / num2;
    }
    
    public void simulateArithmetic(Main main) throws InterruptedException, Exception {
        String message = ("Passing in the values 100 and 10 for arithmetic\n" +
                            "Multiplication: " + multiplication(100, 10) + "\n" +
                            "Division: " + division(100, 10) + "\n" +
                            "Additions: " + addition(100, 10) + "\n" +
                            "Subtraction: " + subtraction(100, 10) + "\n\n" );
        Main.printMessage(message);
        main.hasPassedOnce = true;
    }
}