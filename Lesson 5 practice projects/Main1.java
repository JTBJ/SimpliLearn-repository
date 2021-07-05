import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Collections;

public class Main1 {
    
    private static ArrayList<Integer> arrlist = new ArrayList<Integer>();
    private static ArrayList<Integer> expenses = new ArrayList<Integer>();
    private static boolean hasPassedOnce;
    private static Scanner sc;
    private static Main main = new Main();
    
    public static void setHasPassedOnce(boolean hasPassOnce){
        hasPassedOnce = hasPassOnce;
    }

    public static void main(String[] args) throws InterruptedException, Exception {
        String message = "\n**************************************\n" +
                         "\tWelcome to The Desk \n" +
                         "**************************************\n\n";
        main.printMessage(message);
        optionsSelection();

    }
    
    private static void optionsSelection() throws InterruptedException, Exception {
        
        String[] arr = {"1. I wish to review my expenditure\n",
                "2. I wish to add my expenditure\n",
                "3. I wish to delete my expenditure\n",
                "4. I wish to sort the expenditures\n",
                "5. I wish to search for a particular expenditure\n",
                "6. Close the application\n\n"
        };
        sc = new Scanner(System.in);
        
        int[] arr1 = {1,2,3,4,5,6};
        int  slen = arr1.length;
        
        if (!hasPassedOnce) {
            for(int i = 0 ; i < slen; i++){
                main.printMessage(arr[i]);
            }
        }else{
            printArray(arr, slen);
        }
        
        if (!hasPassedOnce) {
            expenses.add(1000);
            expenses.add(2300);
            expenses.add(45000);
            expenses.add(32000);
            expenses.add(110);
            expenses.addAll(arrlist);
            setHasPassedOnce(true);
        }
        
        String prompt = "\nEnter your choice:\t";
        main.printMessage(prompt);
        sc = new Scanner(System.in);
        int options = 0;
        
        try{
            options =  sc.nextInt();
        }catch (InputMismatchException e) {
            String errMessage = "Invaid entry. You must enter an Integer. Start over.\n\n";
            main.printMessage(errMessage);
            optionsSelection();
        }finally{
        }

        for(int j = 1; j <= slen; j++){
            String count = "J equals " + j + "\n\n";
            main.printMessage(count);
            if(options > 0 && options <= 6){
                sc = new Scanner(System.in);
                switch (options){
                    case 1:
                        String veiwExpenses = "Your saved expenses are listed below:\n" + expenses + "\n\n";
                        main.printMessage(veiwExpenses);
                        optionsSelection();
                        break;
                    case 2:
                        String promptMessage = "\nEnter the value to add your Expense:\n";
                        main.printMessage(promptMessage);
                        int value = 0;
                        try {
                        	value = sc.nextInt();
						} catch (InputMismatchException e) {
							String errMessage = "Invaid entry. You must enter an Integer. Start over.\n\n";
				            main.printMessage(errMessage);
				            optionsSelection();
						}
                        expenses.add(value);
                        String addedValueMessage = "\nYour value is updated\n\n";
                        main.printMessage(addedValueMessage);
                        expenses.addAll(arrlist);
                        String addedValueResultMessage = expenses+"\n";
                        main.printMessage(addedValueResultMessage);
                        optionsSelection();

                        break;
                    case 3:
                        String deleteMessage = "You are about the delete all your expenses! \nConfirm again by selecting the same option...\n";
                        main.printMessage(deleteMessage);
                        int con_choice = 0;
                        try {
							con_choice = sc.nextInt();
						} catch (Exception e) {
							String errMessage = "Invaid entry. You must enter an Integer. Start over.\n\n";
				            main.printMessage(errMessage);
				            optionsSelection();
						}
                        if(con_choice == options){
                               expenses.clear();
                            System.out.println(expenses+"\n");
                            String afterDeletionMessage = "All your expenses are erased!\n\n";
                            main.printMessage(afterDeletionMessage);
                        } else {
                            String wrongSelectionMessage = "Oops... try again!\n\n";
                            main.printMessage(wrongSelectionMessage);
                        }
                        optionsSelection();
                        break;
                    case 4:
                        sortExpenses(expenses);
                        String sortedMessage = "Expenses sorted.\n\n";
                        main.printMessage(sortedMessage);
                        optionsSelection();
                        break;
                    case 5:
                        searchExpenses(expenses);
                        optionsSelection();
                        break;
                    case 6:
                        closeApp();
                        Main.main(new String[0]);
                        break;
                    default:
                        String invalidMessage = ("hey, You have made an invalid choice! Try again.\n\n");
                        main.printMessage(invalidMessage);
                        optionsSelection();
                        break;
                }
            }else{
                String invalidMessage = ("You have made an invalid choice! Try again.\n\n");
                main.printMessage(invalidMessage);
                optionsSelection();
            }
        }
    }
    
    private static void closeApp() throws InterruptedException {
        String message = "Slight alterationn. You will now be taken back to the main menu.\n" +
                         "Closing your application... \nThank you!";
        main.printMessage(message);
        return;
    }
            
    private static void searchExpenses(ArrayList<Integer> arrayList) throws InterruptedException, Exception {
        Scanner scan = new Scanner(System.in);
        
        String message = "Enter the expense you need to search:\t";
        main.printMessage(message);
        Integer response = 0;
        
        try {
        	response = scan.nextInt();
		} catch (Exception e) {
			String errMessage = "Invaid entry. You must enter an Integer. Start over.\n\n";
            main.printMessage(errMessage);
            optionsSelection();
		}
        
        if (expenses.contains(response)) {
            String result = "The expense " + response + " was located at index " + (expenses.indexOf(response) + 1) + "\n\n";
            main.printMessage(result);
        }else{
            String errMessage = "There was no expense of the value " + response + "\n\n";
            main.printMessage(errMessage);
        }
        
    }
    
    private static void sortExpenses(ArrayList<Integer> arrayList) {
       Collections.sort(expenses);
    }
    
    private static void printArray (String[] arr, int slen) {
        for(int i = 0 ; i < slen; i++){
            System.out.print(arr[i]);
        }
    }
}