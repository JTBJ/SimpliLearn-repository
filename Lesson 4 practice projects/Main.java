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
            String message = "This program was designed to cover all the topics of the \"Virtual class Curriculum\" section, lesson 4\n" +
                             "\"Data Structures Arrays and List\".\n\n" +
	                          "You will now be presented with a list of options that summarizes the expectations for each practice project\n\n";
	        printMessage(message);
        }
        String presentOptions = "Choose a process to complete and press enter.\n" +
	                            "1.) right rotate an array by 5 steps\n" +
	                            "2.) find the fourth smallest element in an unsorted list\n" +
	                            "3.) find the sum of n number of elements in the range of L and R where 0 <= L <= R <= n-1.\n" +
	                            "4.) multiply two matrices\n" +
	                            "5.) delete the first occurrence of a key in a singly linked list\n" +
	                            "6.) insert a new element in a sorted circular linked list\n" +
	                            "7.) traverse a doubly linked list in the forward and backward directions\n" +
	                            "8.) insert and remove elements in a stack list\n" +
	                            "9.) insert and remove elements in a queue list\n" +
	                            "10.) find the longest increasing subsequence from a list of random numbers.\n" +
	                            "\"Q\" or \"q\" to quit\n";
	    printMessage(presentOptions);
	    selection = console.nextLine();
	    option(selection);
	    selectionProcess();
    }
    
    public void option(String selection) throws InterruptedException, Exception {
        switch(selection){
            case "1":
                new UtilityClass().initiateRotateRight(this);
                break;
            case "2":
                new UtilityClass().initiateFindFouthSmallestElement(this);
                break;
            case "3":
                new UtilityClass().initiateSumOfRange(this);
                break;
            case "4":
                new UtilityClass().matrixMultiplication(this);
                break;
            case "5":
                new ListImplementations().removeFirstOccurrence(this);
                break;
            case "6":
                CircularlyLinkeListImpl cll = new CircularlyLinkeListImpl();
                cll.createObject(this);
                cll.printNode(this);
                break;
            case "7":
                new ListImplementations().forwardTraversal(this);
                break;
            case "8":
                new StackAndQueueImpl().createStack(this);
                break;
            case "9":
                new StackAndQueueImpl().createQueue(this);
                break;
            case "10":
                new UtilityClass().initiateLongestSequence(this);
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
    
	public static void main(String[] args) throws InterruptedException, Exception {
	   new Main().selectionProcess();
	}
}
