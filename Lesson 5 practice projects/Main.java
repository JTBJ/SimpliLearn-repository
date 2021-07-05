import java.util.Scanner;
import java.util.Random;

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
            String message = "This program was designed to cover all the topics of the \"Virtual class Curriculum\" section, lesson 5\n" +
                             "\"Data Structures sorting and searching.\" All arrays in this application are randomly generated.\n\n" +
	                          "You will now be presented with a list of options that summarizes the expectations for each practice project\n\n";
	        printMessage(message);
        }
        String presentOptions = "Choose a process to complete and press enter.\n" +
	                            "1.) Check if the element is available in the predefined array\n" +
	                            "2.) linear search algorithm\n" +
	                            "3.) binary search algorithm.\n" +
	                            "4.) exponential search algorithm\n" +
	                            "5.) selection sort algorithm\n" +
	                            "6.) bubble sort algorithm\n" +
	                            "7.) insertion sort algorithm\n" +
	                            "8.) merge sort algorithm\n" +
	                            "9.) quick sort algorithm\n" +
	                            "10.) show bug fixes in the application.\n" +
	                            "11.) run original bugs in SimpliLearn app.\n" +
	                            "\"Q\" or \"q\" to quit\n";
	    printMessage(presentOptions);
	    selection = console.nextLine();
	    option(selection);
	    selectionProcess();
    }
    
    public void option(String selection) throws InterruptedException, Exception {
        switch(selection){
            case "1":
                new Algorithms().isPresent(createArray(), this);
                break;
            case "2":
                new Algorithms().initiateLinearSearch(createArray(), this);
                break;
            case "3":
                new Algorithms().initiateBinarySearch(createArray(), this);
                break;
            case "4":
                new Algorithms().initiateExponentialSearch(createArray(), this);
                break;
            case "5":
                new Algorithms().initiateSelectionSort(createArray(), this);
                break;
            case "6":
                new Algorithms().initiateBubbleSort(createArray(), this);
                break;
            case "7":
                new Algorithms().initiateInsertionSort(createArray(), this);
                break;
            case "8":
                new Algorithms().initiateMergeSort(createArray(), this);
                break;
            case "9":
                new Algorithms().initiateQuickSort(createArray(), this);
                break;
            case "10":
            	Main1.main(new String[0]);;
                break;
            case "11":
                String bugApp = "You will now be taken to the original SimpliLearn app before the bug fixes.\n" +
                                "You will need to restart the app when the program crashes.\n\n";
                                printMessage(bugApp);
                BeforeFixes.main(new String[0]);
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
    
    public Integer[] createArray() {
    	
    	Integer[] array = new Integer[10];
		Random rand = new Random();
		for(int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(100);
		}
    	return array;
    }

	public static void main(String[] args) throws InterruptedException, Exception {
	    new Main().selectionProcess();
	}
}
