import java.util.Scanner;

public class WorkingWithString {
    
    public WorkingWithString(Main main){
        String message = "You are now inside the Working_With_String class constructor...\n\n";
        
        try {
            main.printMessage(message);
        } catch(Exception e) {
        } finally {
        }
    }
    
    public String makeStringBuilder(String string, Main main) throws InterruptedException, Exception {
        
        String message = "\nThe next printout shall be an implementation of a StringBuilder\n" +
                         "converted from a string object\n\n";
        
        main.printMessage(message);
        main.setHasPassedOnce(true);
        
        StringBuilder sb = new StringBuilder(string);
        return sb.toString();
    }
    
    public String makeStringBuffer(String string, Main main) throws InterruptedException, Exception {
        
        String message = "\nThe next printout shall be an implementation of a StringBuffer\n" +
                         "converted from a string object\n\n";
        
        main.printMessage(message);
        main.setHasPassedOnce(true);
        
        StringBuffer sb = new StringBuffer(string);
        return sb.toString();
    }
    
    public void validateEmail(Main main) throws InterruptedException, Exception {
        
        Scanner console = new Scanner(System.in);
        
        String result = "";
        String message = "Please enter a valid email address\n";
        main.printMessage(message);
        
        if(console.nextLine().matches("^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?!-)(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$")){
            result = "Email address accepted\n\n";
            main.printMessage(result);
        }else{
            result = "Invalid Email. Select the option to enter an email again to update.\n\n";
            main.printMessage(result);
        }
        main.setHasPassedOnce(true);
    }
    
    public String[] expressions(Main main) throws InterruptedException, Exception {
        
        Scanner console = new Scanner(System.in);
        String message = "\nEnter a message, separated with slashes (/) and press enter.\n" +
                         "The program will attempt to extract everything but the slashes and\n" +
                         "place them in an array. You will then be presented with an options to\n" +
                         "chose an array index to retreive the value at that particular index.\n\n" +
                         "Please enter text separted with slashes (/). After you finish your text\n" +
                         "press enter\n\n";
        
        main.printMessage(message);
        String input = console.nextLine();
        String[] stringArr = input.split("/");
        main.setHasPassedOnce(true);
        choseAnIndex(stringArr, main);
        
        return stringArr;
        
    }
    
    public void choseAnIndex(String[] arr, Main main) throws InterruptedException, Exception {
        Scanner console = new Scanner(System.in);
        String message = "\nEnter an index from which to display\n"; 
        
        main.printMessage(message);
        
        try{
            String input = arr[console.nextInt()];
            main.printMessage(input);
            
            String again = "\n\nWould you like to enter another index?\n\n" +
                            "1.) Yes\n" +
                            "Enter any other value for NO\n\n";
            main.printMessage(again);
            
            console = new Scanner(System.in);
            
            if(console.nextLine().equals("1")){
                choseAnIndex(arr, main);
            }
            
        }catch(ArrayIndexOutOfBoundsException e){
            String error = "You have chosen an index that is not within the range of the array.\n" +
                            "Please chose an index within range.";
            
            main.printMessage(error);
            choseAnIndex(arr, main);
        }
    }
}