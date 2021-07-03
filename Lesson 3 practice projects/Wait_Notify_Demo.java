import java.util.Scanner;

public class Wait_Notify_Demo {
    
    public static void main(String... args) {
        
        Wait_Notify wn = new Wait_Notify();
        
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                try {
                    wn.waitMethod();
                } catch(Exception e) {
                } finally {
                }
            }
        });
        
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                try {
                    wn.notifyMethod();
                } catch(Exception e) {
                } finally {
                }
            }
        });
        
        t1.start();
        t2.start();
    }
}

class Wait_Notify {
    
    public synchronized void waitMethod() throws InterruptedException {
        
        synchronized(this) {
            System.out.println("waitMethod() thread running...");
            
            wait();
            
            System.out.println("waitMethod() thread resume...");
        }
    }
    
    public synchronized void notifyMethod() throws InterruptedException {
        Scanner console = new Scanner(System.in);
        // Thread.sleep(1000);
        
        synchronized(this) {
            System.out.println("Press enter to continue...");
            console.nextLine();
            notify();
            System.out.println("Notify invoked...");
            // Thread.sleep(1000);
        }

    }
}