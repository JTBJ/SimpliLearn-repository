import java.util.*;
import java.io.*;

public class AppendingToFileWritingToConsole {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> al = new ArrayList<>();
        ArrayList<String> al2 = new ArrayList<>();
        ArrayList<String> al3 = new ArrayList<>();
        ArrayList<String> al4 = new ArrayList<>();
        ArrayList<String> al1 = new ArrayList<>();

        al.add("Movies");
        al.add("Programming");
        al.add("Workouts");
        al.add("Reading");
        al.add("Eating");
        al.add("Working");

        al2.add("Predators");
        al.add("Java");
        al2.add("Bench Press");
        al2.add("Books");
        al2.add("Carl Jr's");
        al2.add("Online");

        al3.add("Lawrence Fishborne");
        al3.add("Data Structures");
        al3.add("Curls");
        al3.add("JavaScript");
        al3.add("Double Cheese Burgers");
        al3.add("Answering Questions");

        al4.add("Predator");
        al4.add("Loops");
        al4.add("Jogging");
        al4.add("Network+");
        al4.add("French Fries");
        al4.add("Answer Phone");


        try {
            FileWriter fw = new FileWriter("files.txt");
            for(String element : al){
                fw.write(element + System.lineSeparator());
            }
            fw.close();
        }catch (Exception e){
        }finally {
        }

        try {
            FileWriter fw = new FileWriter("files.txt", true);
            for(String element : al2){
                fw.append(element + System.lineSeparator());
            }
            fw.close();
        }catch (Exception e){
        }finally {
        }

        try {
            FileWriter fw = new FileWriter("files.txt", true);
            for(String element : al3){
                fw.append(element + System.lineSeparator());
            }
            fw.close();
        }catch (Exception e){
        }finally {
        }

        try {
            FileWriter fw = new FileWriter("files.txt", true);
            for(String element : al4){
                fw.append(element + System.lineSeparator());
            }
            fw.close();
        }catch (Exception e){
        }finally {
        }

        try {
            Scanner fr = new Scanner(new FileReader("files.txt"));
            while(fr.hasNext()){
                String line = fr.next(); //temp variable to hold what is read from the file
                al1.add(line); //using second array to store the "line" values
            }
        }catch (Exception e){
        }finally {
        }
        System.out.println("The value in the file is " + al1);
    }
}