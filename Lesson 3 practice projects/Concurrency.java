public class Concurrency implements Runnable {
    
    Main main = new Main();
    
    private int counter = 1;
    
    public void run() {
        while(counter <= 10){
	        try {
	            Thread.sleep(1000);
	            System.out.println(counter + " " + Thread.currentThread().getName());
    	        Thread.sleep(1000);
	        } catch(Exception e) {
	        } finally {
	        }
    	    counter++;
        }
    }
    
    public void startThreads() {
        
        Concurrency m1 = new Concurrency();
	    Concurrency m2 = new Concurrency();
	    Concurrency m3 = new Concurrency();
	    Concurrency m4 = new Concurrency();
	    Thread thread1 = new Thread(m1, "Thread1");
	    Thread thread2 = new Thread(m2, "Thread2");
	    Thread thread3 = new Thread(m3, "Thread3");
	    Thread thread4 = new Thread(m4, "Thread4");
	  
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        main.setHasPassedOnce(true);
    }
}