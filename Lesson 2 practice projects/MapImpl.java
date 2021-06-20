import java.util.Map;
import java.util.TreeMap;

public class MapImpl {
    
    Map<Integer, String> map = new TreeMap<>();
    
    public MapImpl(Main main){
        
        String message = "You are now inside the MapImpl class constructor...\n\n";
        
        try {
            main.printMessage(message);
        } catch(Exception e) {
        } finally {
        }
        
        map.put(1, "SimpliLearn");
        map.put(2, "Full Stack Java");
        map.put(3, "Global Certification");
        map.put(4, "Better job");
        map.put(5, "Enjoyable career");
    }
    
    public String printMap(Main main) throws InterruptedException, Exception {
        
        main.setHasPassedOnce(true);
        return "\nKey value pairs of the map instance...\n" + map + "\n\n";
    }
}