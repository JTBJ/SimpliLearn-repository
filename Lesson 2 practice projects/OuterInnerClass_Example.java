public class OuterInnerClass_Example {
    
    public OuterInnerClass_Example(Main main){
        String message = "You are now inside the Outer class constructor\n" +
                         "it was needed to create the inner class object...\n\n";
        
        try {
            main.printMessage(message);
        } catch(Exception e) {
        } finally {
        }
    }
    
    class Inner {
        
        public Inner(Main main){
            String message = "You are now inside the Inner class constructor...\n" +
                             "It was instantiate from the Main application class using\n" +
                             "OuterInnerClass_Example.Inner = outerObject.new Inner(this);\n\n";
            
            try {
                main.printMessage(message);
            } catch(Exception e) {
            } finally {
            }
        }
        
        public void innerClassMethod(Main main) throws InterruptedException, Exception {
            String message = "\nInside Inner class method...\n\n";
            
            main.printMessage(message);
            main.setHasPassedOnce(true);
        }
    }
}