import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    
    private ArrayList arrayList;
    
    private ArrayList_Example arrayList_Example = new ArrayList_Example(this);
    private MapImpl mapImpl = new MapImpl(this);
    private OuterInnerClass_Example outerObject = new OuterInnerClass_Example(this);
    private OuterInnerClass_Example.Inner innerObject = outerObject.new Inner(this);
    private WorkingWithString wws = new WorkingWithString(this);

    private boolean hasPassedOnce;
    private String value = "This String represents the Main class object";
    
    public Main(){
        arrayList = new ArrayList();
        String message = "You are now inside the Main class constructor...\n\n" +
                         "The collection data structure, ArrayList, has been initialized...\n\n";
        try {
            //printMessage(message);
        } catch(Exception e) {
        } finally {
        }
    }
    
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
            String message = "This program is designed to accomoplish all the requirements of lesson 2.\n" +
                             "It demostrates methods, constructors, collections, maps, inner classes,\n" +
	                          "Strings, arrays, regular expressions and email validation.\n\n" +
	                          
	                          "Bare in mind that a method is called to initiate this message and every other aspect of\n" +
	                          "this program and these messages are strings converted to char arrays, therefore,\n" +
	                          "methods, strings and arrays should be checked off the list of objectives to accomplish\n" +
	                          "for this program. Also, constructor invokation is demostrated servarl times with messages\n" +
	                          "from the class construtors within the program, once they are instantiated. Construstors should\n" +
	                          "therefore, also be checked off for this submission\n\n" +
	                          
	                          "You will now be presented with a list of options to choose a specific aspect, from the\n" +
	                          "list of features previously described, to execute.\n\n";
	        printMessage(message);
        }
        String presentOptions = "Choose a process to complete and press enter.\n" +
	                            "1.) Example of the Collection type, ArrayList\n" +
	                            "2.) Map instance\n" +
	                            "3.) Print message from inner class method\n" +
	                            "4.) StringBuiler value\n" +
	                            "5.) StringBuffer value\n" +
	                            "6.) Use Regular Expressions to convert a string to an array\n" +
	                            "7.) Email Validation\n" +
	                            "\"Q\" or \"q\" to quit\n";
	    printMessage(presentOptions);
	    selection = console.nextLine();
	    option(selection);
	    selectionProcess();
    }
    
    public void option(String selection) throws InterruptedException, Exception {
        switch(selection){
            case "1":
                String arrayList_Message = arrayList_Example.arrayListExample(arrayList, this);
                printMessage(arrayList_Message);
                hasPassedOnce = true;
                break;
            case "2":
                String mapImpl_Message = mapImpl.printMap(this);
                printMessage(mapImpl_Message);
                break;
            case "3":
                innerObject.innerClassMethod(this);
                break;
            case "4":
                String stringBuilder = wws.makeStringBuilder("Vaule of a String Builder\n\n", this);
                printMessage(stringBuilder);
                break;
            case "5":
                String stringBuffer = wws.makeStringBuffer("Vaule of a String Buffer\n\n", this);
                printMessage(stringBuffer);
                break;
            case "6":
                String arrValue = "The current values in your array\n" + Arrays.toString(wws.expressions(this))+ "\n\n";
                printMessage(arrValue);
                break;
            case "7":
                wws.validateEmail(this);
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
    
    @Override
    public String toString(){
        return value;
    }
    
	public static void main(String[] args) throws InterruptedException, Exception {
	                          
	    Main main = new Main();
	    main.selectionProcess();
		System.out.println("Hello World");
	}
}
