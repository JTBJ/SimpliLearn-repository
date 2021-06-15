import java.util.Scanner;

public class Main {
    
    boolean hasPassedOnce;
    
    public void sleepTimer(int waitTime) throws InterruptedException {
        Thread.sleep(waitTime);
    }
    
    public void numberConverter() throws InterruptedException {
        String number = "89";
        
        StringConverter sc = new StringConverter();
        
	    sc.welcomeMessage();
		sc.stringConverter(number);
    }
    
    public void selectionProcess() throws InterruptedException, Exception {
        
        Scanner console = new Scanner(System.in);
        String selection = "";
        
        if(!hasPassedOnce){
            String message = "This application is designed in full to complete all tasks\n" + //commit adjustments once finish
	                     "listed in the first two days of class.\n" +
	                     "You will be presented with a list of options to choose from.\n\n";
	        Main.printMessage(message);
        }
        String presentOptions = "Choose a process to complete and press enter.\n" +
	                            "1.) Number Converter\n" +
	                            "2.) Access Modifiers\n" +
	                            "3.) Arithmetic Calculations\n" +
	                            "4.) Map Collections instance\n" +
	                            "5.) Return a value from method\n" +
	                            "6.) Implicit Casting\n" +
	                            "7.) Explicity Casting\n" +
	                            "\"Q\" or \"q\" to quit\n";
	    Main.printMessage(presentOptions);
	    selection = console.nextLine();
	    option(selection);
	    selectionProcess();
        
    }
    
    public void option(String selection) throws InterruptedException, Exception {
        switch(selection){
            case "1":
                numberConverter();
                hasPassedOnce = true;
                break;
            case "2":
                AccessDemo ad = new AccessDemo(this);
                //hasPassedOnce = true;
                break;
            case "3":
                new SimpliArithmatic().simulateArithmetic(this);
                break;
            case "4":
                new MapImpl().printMap(this);
                break;
            case "5":
                System.out.println(returnStatementDemo());
                hasPassedOnce = true;
                sleepTimer(2000);
                break;
            case "6":
                new SimpliArithmatic().implicitTypeCasting(this);
                break;
            case "7":
                new SimpliArithmatic().explicitTypeCasting(this);
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
                Main.printMessage(errorMessage);
                hasPassedOnce = true;
                selectionProcess();
        }
    }
    
    public static void printMessage(String message) throws InterruptedException {
        char[] charArr = message.toCharArray();
        
        for(int i = 0; i < charArr.length; i++){
            if(Character.toString(charArr[i]).equals("\n")){
                new Main().sleepTimer(2000);
            }
            System.out.print(charArr[i]);
            new Main().sleepTimer(50);
        }
    }
    
    public String returnStatementDemo() throws InterruptedException, Exception {
        String message = "This selection is used to return a value from a method.\n" +
                         "Consider the fact there are several classes in this program\n" +
                         "that each has their own set of methods.\n\n";
        Main.printMessage(message);
        sleepTimer(2000);
        return "The current message is the return statement. I am a String.\n\n";
    }
    
	public static void main(String[] args) throws InterruptedException, Exception {
	    Main main = new Main();
	    main.selectionProcess();
	}
}

/*It took me a while to find this page. By the time I finally found it, 
I had merged multiple project into one application, which spans several classes. 
I have included several key features from various lessons into this submission.*/ 

