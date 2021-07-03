import java.util.Scanner;

public class Main {
    
    private boolean hasPassedOnce;
    
    public void setHasPassedOnce(boolean hasPassedOnce){
        this.hasPassedOnce = hasPassedOnce;
    }
    
    public void sleepTimer(int waitTime) throws InterruptedException {
        Thread.sleep(waitTime);
    }
    
    public void printMessage(String message) throws InterruptedException {
        char[] charArr = message.toCharArray();
        
        for(int i = 0; i < charArr.length; i++){
            if(Character.toString(charArr[i]).equals("\n")){
                sleepTimer(2000);
            }
            System.out.print(charArr[i]);
            sleepTimer(50);
        }
    }
    
    public void selectionProcess() throws InterruptedException, Exception {
        
        Scanner console = new Scanner(System.in);
        String selection = "";
        
        if(!hasPassedOnce){
            String message = "This program was designed to cover all the topics of the \"Virtual class Curriculum\" sectin, lesson 3\n" +
                             "\"Multi-threading, Exception Handling and OOP\". It demostrates threads, the sleep() and wait() methods,\n" + 
                             "synchronization, try...catch blocks, key words and custom exceptions, exception handlers, file handlers,\n" +
                             "the four pillars of OOP and the dimond problem.\n\n" +
                            
	                          "Bare in mind that sleep() methods are used to print the messages of this program, such as this one,\n" +
	                          "try...catch blocks are used in the run() methods, key words, such as \"throws\" is used to throw\n" +
	                          "exceptions, exception handlers are added to try...catch blocks and a synchronized blocks are added to\n" +
	                          "the anonymous class declarations which implement the Runnable interface. Therefore the sleep() method,\n" +
	                          "try...catch blocks, key words, exception handlers, and the synchronized keyword should be checked\n" +
	                          "off the list of objectives for this program.\n\n" +
	                          
	                          "Options to chose from includes the wait() methods, custom exceptions, file handlers, the four pillars\n" +
	                          "of OOP and the diamond problem.\n" +
	                          "You will now be presented with a list of options to choose a specific aspect, from the\n" +
	                          "list of features previously described, to execute.\n\n";
	        printMessage(message);
        }
        String presentOptions = "Choose a process to complete and press enter.\n" +
	                            "1.) Print Threads\n" +
	                            "2.) Demostration of the wait() and notify() methods\n" +
	                            "3.) Demostrate file handling with serialization and deserialization.\n" +
	                            "4.) Inheritance, polymorphism, abstraction and encapsulation\n" +
	                            "5.) File handling: appending to file / reading file to console\n" +
	                            "6.) Dimond problem. Inheritting same method from multiple entities\n" +
	                            "\"Q\" or \"q\" to quit\n";
	    printMessage(presentOptions);
	    selection = console.nextLine();
	    option(selection);
	    selectionProcess();
    }
    
    public void option(String selection) throws InterruptedException, Exception {
        switch(selection){
            case "1":
                new Concurrency().startThreads();
                sleepTimer(20000);
                hasPassedOnce = true;
                break;
            case "2":
                Wait_Notify_Demo.main(new String[2]);
                sleepTimer(20000);
                hasPassedOnce = true;
                break;
            case "3":
                new WriteToAndFromFile().createObject();
                hasPassedOnce = true;
                break;
            case "4":
                new Main2().main(new String[0]);
                hasPassedOnce = true;
                break;
            case "5":
                new AppendingToFileWritingToConsole().main(new String[0]);
                hasPassedOnce = true;
                break;
            case "6":
                new Class4().dimondMethod();
                hasPassedOnce = true;
                break;
            case "Q":
                String quitMessage = "Terminating applicaiton...";
                printMessage(quitMessage);
                sleepTimer(3000);
                System.exit(0);
            case "q":
                String quitMessage2 = "Terminating applicaiton...";
                printMessage(quitMessage2);
                sleepTimer(3000);
                System.exit(0);
            default:
                String errorMessage = "You have entered an invalid value. Try again.\n";
                printMessage(errorMessage);
                hasPassedOnce = true;
                selectionProcess();
        }
    }
    
	public static void main(String[] args) throws InterruptedException, UserDefinedException, Exception {
	   new Main().selectionProcess();
	}
}

