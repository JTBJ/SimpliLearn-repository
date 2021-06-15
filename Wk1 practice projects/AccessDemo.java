import java.util.ArrayList;

public class AccessDemo extends ArrayList {
    
    private ArrayList<Integer> al = new ArrayList<>();
    Main main;
    
    public AccessDemo(Main main) throws Exception {
        this.main = main;
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);
        String message = "The current class subclasses no class.\n\n";
        Main.printMessage(message);
        callProtectedMethod();
    }
    
    public void callProtectedMethod() throws InterruptedException, Exception {
        String values = "Here are the values stored int he array list.\n" +
                        "This will also be considered as accessing the\n" +
                        "private Arraylist in the current class.\n\n";
        String message = "\nCalling the protected method, removeRange(int fromIndex, int toIndex)\n" +
                         "from the ArrayList class.\n\n";
        
        Main.printMessage(values);
        main.sleepTimer(2000);
        System.out.print(al);
        new Main().sleepTimer(2000);
        Main.printMessage(message);
        main.sleepTimer(2000);
        
        /*al.removeRange(1, 4);*/
        
        String errorMessaage = "removeRange(int,int) has protected access in ArrayList.\n" +
                                "For access, place both classes in the same package.\n\n";
        Main.printMessage(errorMessaage);
        
        String privateAccess = "Accessing private Arraylist in the current class.\n\n";
        Main.printMessage(privateAccess);
        String programIntel = "If you have noticed, when you traverse the program a few\n" +
                              "times before selecting option 2, you are not presented with\n" +
                              "the initial message that briefs you on this program. When you\n" +
                              "choose option 2, the program accesses a default variable of the\n" +
                              "class Main and sets it to false, triggering the program to present\n" +
                              "the initial program briefing.\n\n";
        main.hasPassedOnce = false;
        Main.printMessage(programIntel);
    }
}