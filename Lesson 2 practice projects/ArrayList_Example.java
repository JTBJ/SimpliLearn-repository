import java.util.ArrayList;

public class ArrayList_Example {
    
    public ArrayList_Example(Main main){
        String message = "You are now inside the ArrayList_Example class constructor...\n\n";
        
        try {
            main.printMessage(message);
        } catch(Exception e) {
        } finally {
        }
    }
    
    public static String arrayListExample(ArrayList arrayList, Main main) throws InterruptedException, Exception {
        
        String message = "\nThe call to this method produces an ArrayList that does not apply generics\n\n";
        
        main.printMessage(message);
        
        arrayList.add(new Integer(100));
        arrayList.add(new String("String at index 1"));
        arrayList.add(new Double(100.75));
        arrayList.add(main);
        arrayList.add(new Character('A'));
        
        main.setHasPassedOnce(true);
        return "ArrayList index values...\n" + arrayList + "\n\n";
    }
}