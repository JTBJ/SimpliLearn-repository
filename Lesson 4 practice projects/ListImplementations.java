import java.util.LinkedList;
import java.util.Iterator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ListImplementations {
    
    Random rand = new Random();
    Scanner scan = new Scanner(System.in);
    
    public void removeFirstOccurrence (Main main) throws InterruptedException {
        
        List<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < 9; i++) {
            list.add(rand.nextInt(100));
        }
        
        String message = "This method creates a LinkedList and randomly assigns it 10 values between 0 and 100.\n" +
                         "Here are the values for the List.\n" + list + "\n\n"; 
        main.printMessage(message);
        
        String promptMessage = "Key in the value you would like to delete:\n";
        main.printMessage(promptMessage);
        
        int response = 0;
        try {
            response = scan.nextInt();
        }catch(InputMismatchException e) {
            String errMessage = "\nInvalid entry, must be an integer. Try again.\n";
            main.printMessage(errMessage);
            removeFirstOccurrence(main);
        }
        
        Iterator<Integer> iterate = list.iterator();
        if (list.contains(response)) {
            while(iterate.hasNext()) {
                if (iterate.next() == response) {
                    iterate.remove();
                    break;
                }
            }
        }else {
            String errMessage1 = "\nNo value matching your selection. Try again.\n";
            main.printMessage(errMessage1);
            removeFirstOccurrence(main);
        }
        
        String afterMessage = "\nHere is the value of the list after the removal:\n" + list + "\n";
        main.printMessage(afterMessage);
        main.setHasPassedOnce(true);
    }
    
    public void forwardTraversal (Main main) throws InterruptedException {
        
        List<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < 9; i++) {
            list.add(rand.nextInt(100));
        }
        
        String message = "This method creates a LinkedList and randomly assigns it 10 values between 0 and 100.\n" +
                         "Here are the values for the List.\n" + list + "\n\n"; 
        main.printMessage(message);
        
        String message2 = "Traversing forward\n";
        main.printMessage(message2);
        
        Iterator<Integer> iterate = list.iterator();
            while(iterate.hasNext()) {
                System.out.print(iterate.next() + " ");
            }
                System.out.println("\n\n");
            backwardTraversal(list, main); 
    }
    
    public void backwardTraversal (List list, Main main) throws InterruptedException {
        
        String message2 = "Traversing backward\n";
        main.printMessage(message2);
        
        Iterator<Integer> iterate = ((LinkedList)list).descendingIterator();
            while(iterate.hasNext()) {
                System.out.print(iterate.next() + " ");
            }
                System.out.println("\n\n");

        main.setHasPassedOnce(true);
    }
    
}