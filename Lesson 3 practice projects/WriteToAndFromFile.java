import java.util.Scanner;
import java.io.Serializable;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class WriteToAndFromFile implements Serializable { 
    
    String name;
    String profession;
    String ethnicy;
    String yearsWorked;
    String gender;
    
    public WriteToAndFromFile(){
        
    }
    
    public WriteToAndFromFile(String name, String profession, String ethnicy, String yearsWorked, String gender) {
        this.name = name;
        this.profession = profession;
        this. ethnicy = ethnicy;
        this.yearsWorked = yearsWorked;
        this.gender = gender;
    }
    
    public void createObject() throws InterruptedException {
        Scanner console = new Scanner(System.in);
        
        String message = "This phase of the program will take your input and create an object from\n" +
                         "the input you provide and commit this information to file. It will then\n" +
                         "retreive this information from file, in the form of an object. When inputting\n" +
                         "data, press enter after each value entered.\n\n" +
                         "You will now be presented with the input request.\n\n" +
                         "Enter your name, profession, ethnicy, amount of years worked and gender.\n\n";
        new Main().printMessage(message);
        
        writeObjectToFile(new WriteToAndFromFile(console.nextLine(), console.nextLine(), console.nextLine(), console.nextLine(), console.nextLine()));
    }
    
    public void writeObjectToFile(WriteToAndFromFile obj) {
        
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.txt"))) {
            oos.writeObject(obj);
            new Main().printMessage("Writing object to file...\n");
        } catch(Exception e) {
        } finally {
        }
        readObjectFromFile();
    }
    
    public void readObjectFromFile() {
        
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.txt"))) {
            WriteToAndFromFile ww = ((WriteToAndFromFile)ois.readObject());
            new Main().printMessage("Reading object from file...\n");
            new Main().printMessage(ww.toString());
        } catch(Exception e) {
        } finally {
        }
    }
    
    @Override
    public String toString() {
        return "[Name: " + name + ", Profession: " + profession + ", Ethnicy: " + ethnicy + ", Years Worked: " + yearsWorked + ", Gender: " + gender + "]\n";
    }
}