public class StringConverter {
    
    Main main = new Main();
    
    public void stringConverter(String string) throws InterruptedException {
        
        byte num1 = Byte.parseByte(string);
        System.out.println("Byte: " + num1);
        main.sleepTimer(2000);
        
        short num0 = Short.parseShort(string);
        System.out.println("Short: " + num0);
        main.sleepTimer(2000);
        
        int num2 = Integer.parseInt(string);
        System.out.println("Integer: " + num2);
        main.sleepTimer(2000);
        
        long num3 = Long.parseLong(string);
        System.out.println("Long: " + num3);
        main.sleepTimer(2000);
        
        float num4 = Float.parseFloat(string);
        String floatOutput = String.format("Float: %.2f", num4);
        System.out.println(floatOutput);
        main.sleepTimer(2000);
        
        double num5 = Double.parseDouble(string);
        String doubleOutput = String.format("Double: %.5f", num5);
        System.out.println(doubleOutput);
        main.sleepTimer(2000);
    }
    
    public void welcomeMessage() throws InterruptedException {
        String message = "This program will convert the number 89 to varialbes" +
                         "\nbyte, short, int, long, float and double.\n\n";
        
        Main.printMessage(message);
        main.sleepTimer(3000);
    }
    
}