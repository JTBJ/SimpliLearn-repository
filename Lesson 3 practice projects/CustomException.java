import java.io.IOException;

public class CustomException {
    
    int age;
    
    public void customExceptionDemo() throws InterruptedException, UserDefinedException {
        
        String message = "This is a demonstration of implementing custom exceptions. I will explicitly\n" +
                         "configure the application to throw an exception and it will be handled in the\n" +
                         "calling method.\n\n";
        new Main().printMessage(message);
        setAge(16);
    }
    
    public void setAge(int age) throws UserDefinedException, InterruptedException {
        
        if(age < 18) {
		    try {
    		    throw new UserDefinedException();
    		} catch(UserDefinedException e) {
    		    e.printStackTrace();
    		} finally {
    		}
		}
    }
}

class UserDefinedException extends Exception {//user defined Exceptions must be cheched Exceptions
    
    public UserDefinedException() throws InterruptedException {
    // public UserDefinedException(String msg) {
        //super(msg);
        String err = "User must be 18 or older. ";
        new Main().printMessage(err);
    }
}