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
    
    public void implicitTypeCasting(Main main) throws InterruptedException, Exception {
        String message = "This program will apply implicit type casting, called widening\n" +
                         "from the byte data type to the double data type. It will first\n" +
                         "initialize a byte variable with the value 127 and assign the value\n" +
                         "to the larger primitive types, from smallest to largest.\n\n";
        Main.printMessage(message);
                         
        byte bite = 127;
        short shurt = bite;
        int nt = shurt;
        long lng = nt;
        float flote = lng;
        double dble = flote;
        
        String result = "Byte: " + bite + "\n" +
                        "Short: " + shurt + "\n" +
                        "Int: " + nt + "\n" +
                        "Long: " + lng + "\n" +
                        "Float: " + flote + "\n" +
                        "Double: " + dble + "\n";
        Main.printMessage(result);
        main.hasPassedOnce = true;
    }
    
    public void explicitTypeCasting(Main main) throws InterruptedException, Exception {
        
        String message = "This program will apply explicit type casting, called narrowing\n" +
                         "from the double data type to the byte data type. It will first\n" +
                         "initialize a double variable with the value 100.32 and assign the value\n" +
                         "to the smaller primitive types, from largest to smallest.\n\n";
                         
        Main.printMessage(message);
                         
        double dble = 100.32;
        float flote = (float)dble;
        long lng = (long)flote;
        int nt = (int)lng;
        short shurt = (short)nt;
        byte bite = (byte)shurt;
        
        String result = "Double: " + dble + "\n" +
                        "Float: " + flote + "\n" +
                        "Long: " + lng + "\n" +
                        "Int: " + nt + "\n" +
                        "Short: " + shurt + "\n" +
                        "Byte: " + bite + "\n";
        Main.printMessage(result);
        
        main.hasPassedOnce = true;
    }
}