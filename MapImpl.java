import java.util.Map;
import java.util.TreeMap;

public class MapImpl {
    
    Map<Integer, String> map = new TreeMap<>();
    
    public MapImpl(){
        map.put(1, "SimpliLearn");
        map.put(2, "Full Stack Java");
        map.put(3, "Global Certification");
        map.put(4, "Better job");
        map.put(5, "Enjoyable career");
    }
    
    public void printMap(Main main) throws InterruptedException, Exception {
        for(int i = 1; i <= map.size(); i++){
            String temp = map.get(i) + "\n";
            Main.printMessage(temp);
        }
        System.out.println(map);
        main.hasPassedOnce = true;
    }
}