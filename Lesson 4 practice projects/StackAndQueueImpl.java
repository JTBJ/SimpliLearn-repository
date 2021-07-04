import java.util.Stack;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Random;

public class StackAndQueueImpl {
    
    boolean hasPassedOnce;
    Random rand = new Random();
    
    public void createStack(Main main) throws InterruptedException {
        
        String message = "This method creates a stack of 10 random numbers between 0 and 100 and displays its content\n";
        main.printMessage(message);
        
        Stack<Integer> records = new Stack<>();
        
        if(records.empty()) {
            for(int i = 0; i < 10; i++) {
                records.push(rand.nextInt(100));
            }
        }
        
        String printout = records.toString() + "\n\n";
        main.printMessage(printout);
 
        for(int i = 0; i < 3; i++) {
            deleteOccurence(main, records);
            printout = records.toString() + "\n\n";
            main.printMessage(printout);
        }
        
        for(int i = 0; i < 3; i++) {
            addOccurence(main, records);
            printout = records.toString() + "\n\n";
            main.printMessage(printout);
        }

        main.setHasPassedOnce(true);
    }
    
    public void deleteOccurence(Main main, Stack stack) throws InterruptedException {
        
        String message = "";
        
        if(!hasPassedOnce) {
            message = "Removing an element from the stack\n";
            main.printMessage(message);
            stack.pop();
        }else{
            message = "Removing another element from the stack\n";
            main.printMessage(message);
            stack.pop();
        }
        
        hasPassedOnce = true;
    }
    
    public void addOccurence(Main main, Stack records) throws InterruptedException {
        
        String message = "";
        
        if(hasPassedOnce) {
            message = "Adding an element to the stack\n";
            main.printMessage(message);
            records.push(rand.nextInt(100));
        }else{
            message = "Adding another element to the stack\n";
            main.printMessage(message);
            records.push(rand.nextInt(100));
        }
        
        hasPassedOnce = false;
    }
    
    public void createQueue(Main main) throws InterruptedException {
        
        String message = "This method creates a Queue of 10 random numbers between 0 and 100 and displays its content\n";
        main.printMessage(message);
        
        Queue<Integer> line = new ArrayDeque<>();
        
        if(line.isEmpty()) {
            for(int i = 0; i < 10; i++) {
                line.add(rand.nextInt(100));
            }
        }
        
        String printout = line.toString() + "\n\n";
        main.printMessage(printout);
 
        for(int i = 0; i < 3; i++) {
            deleteQueueOccurence(main, line);
            printout = line.toString() + "\n\n";
            main.printMessage(printout);
        }
        
        for(int i = 0; i < 3; i++) {
            addQueueOccurence(main, line);
            printout = line.toString() + "\n\n";
            main.printMessage(printout);
        }

        main.setHasPassedOnce(true);
    }
    
    public void deleteQueueOccurence(Main main, Queue stack) throws InterruptedException {
        
        String message = "";
        
        if(!hasPassedOnce) {
            message = "Removing an element from the Queue\n";
            main.printMessage(message);
            stack.remove();
        }else{
            message = "Removing another element from the Queue\n";
            main.printMessage(message);
            stack.remove();
        }
        
        hasPassedOnce = true;
    }
    
    public void addQueueOccurence(Main main, Queue line) throws InterruptedException {
        
        String message = "";
        
        if(hasPassedOnce) {
            message = "Adding an element to the Queue\n";
            main.printMessage(message);
            line.add(rand.nextInt(100));
        }else{
            message = "Adding another element to the Queue\n";
            main.printMessage(message);
            line.add(rand.nextInt(100));
        }
        
        hasPassedOnce = false;
    }

}