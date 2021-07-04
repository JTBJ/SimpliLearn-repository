import java.util.Arrays;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Collections;
import java.util.Scanner;
import java.util.InputMismatchException;

public class UtilityClass {
    
    private Random rand = new Random();
    
    public void initiateRotateRight(Main main) throws InterruptedException {
        
        int[] intArray = new int[10];
        
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = rand.nextInt(100);
        }
        
        String message = "This method creates an array of size 10 and randomly assigns it values between 0 and 100.\n" +
                         "Here are the values for the array.\n" + Arrays.toString(intArray) + "\n\n"; 
        main.printMessage(message);
        
        Arrays.sort(intArray);
        String sortedMessage = "Here is the same array sorted in acsending format:\n" + Arrays.toString(intArray) + "\n\n";
        main.printMessage(sortedMessage);
        
        String shifttedMessage = "Here is the same array after shifting right by 5 elements:\n" + Arrays.toString(rotateRightByFive(intArray)) + "\n\n";
        main.printMessage(shifttedMessage);
        main.setHasPassedOnce(true);
    }
    
    public int[] rotateRightByFive(int[] array) {
        int[] tempArray = new int[5];
        
        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i] = array[i];
        }
        
        for (int i = 5; i < array.length; i++) {
            array[i - 5] = array[i];
        }
        
        for (int i = 5, j = 0; i < array.length; i++, j++) {
            array[i] = tempArray[j];
        }
        
        return array;
    }
    
    public void initiateFindFouthSmallestElement (Main main) throws InterruptedException {
        
        List<Integer> list = new ArrayList<Integer>(10);
        for (int i = 0; i < 9; i++) {
            list.add(rand.nextInt(100));
        }
        
        String message = "This method creates a List and randomly assigns it 10 values between 0 and 100.\n" +
                         "Here are the values for the List.\n" + list + "\n\n"; 
        main.printMessage(message);
        
        Collections.sort(list);
        String sortedMessage = "Here is the same list sorted in acsending format:\n" + list + "\n\n";
        main.printMessage(sortedMessage);
        
        String shifttedMessage = "Here is the value for the 4th smallest element in the list:\n" + findFouthSmallestElement(list) + "\n\n";
        main.printMessage(shifttedMessage);
        main.setHasPassedOnce(true);
    }
    
    public int findFouthSmallestElement(List<Integer> arryLst) {
        
        Set<Integer> set = new HashSet<Integer>();
        for (Integer i : arryLst) {
            set.add(i);
        }
        
        arryLst.clear();
        
        Iterator<Integer> iterate = set.iterator();
        while(iterate.hasNext()) {
            arryLst.add(iterate.next());
        }
        Collections.sort(arryLst);
        return arryLst.get(3);
    }
    
    public void initiateSumOfRange(Main main) throws InterruptedException {
        
        int[] intArray = new int[10];
        Scanner scan = new Scanner(System.in);
        
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = rand.nextInt(100);
        }
        
        String message = "This method creates an array of size 10 and randomly assigns it values between 0 and 100.\n" +
                         "Here are the values for the array.\n" + Arrays.toString(intArray) + "\n\n"; 
        main.printMessage(message);
        
        String sortedMessage = "Enter the range in which you would like to sum, beginning from the start position to the end position.\n" +
                               "There should be no negative values or values greater than ten.\n\n";
        main.printMessage(sortedMessage);
        // int sum = sumOfRange(scan.nextInt(), scan.nextInt(), main);
        
        String calculation = "";
        
        try {
            calculation = "Here is the sum of the range of elements:\n" + sumOfRange(intArray, scan.nextInt(), scan.nextInt()) + "\n\n";
        } catch(InputMismatchException e) {
            String errMessage = "You have entered an invalid number. Try again.\n\n";
            main.printMessage(errMessage);
            initiateSumOfRange(main);
        }catch (IndexOutOfBoundsException iob) {
            String errMessage2 = "Number not in range. Try again.\n\n";
            main.printMessage(errMessage2);
            initiateSumOfRange(main);
        } finally {
        }
        main.printMessage(calculation);
        main.setHasPassedOnce(true);
    }
    
    public int sumOfRange (int[] array, int start, int end) {
        
        int sum = 0;
        for (int i = start; i <= end - 1; i++) {
            if((start >= 0)) {
                if(start == 0) {
                    sum += array[i];
                }else {
                    sum += array[i - 1];
                }
            }
        }
        return sum;
    }
    
    public void matrixMultiplication(Main main) throws InterruptedException {
        
        int[][] intArray = new int[5][5];
        int[][] intArray2 = new int[5][5];
        int[][] intArray3 = new int[5][5];
        
        for (int i = 0; i < intArray.length; i++) {
            for(int j = 0; j < intArray[i].length; j++) {
                intArray[i][j] = rand.nextInt(100);
                intArray2[i][j] = rand.nextInt(100);
                /*for(int k = 0; k < i; k++) {
                    for(int l = 0; l < intArray3[k].length; l++) {
                        intArray3[i][j] = intArray[i][k] * intArray2[k][j];
                    }
                    // intArray3[i][j] = intArray[i][k] * intArray2[k][j];
                }*/
            }
        }
        
        String message = "This method creates two 2-D matrixes of size 5 and randomly assigns them values between 0 and 100.\n" +
                         "It then attempts to multiply the 2 matricies and displays the product to the console.\n" +
                         "Here are the values for the 2-D arrays.\n\n"; 
        main.printMessage(message);
        displayArray(intArray);
        main.sleepTimer(2000);
        displayArray(intArray2);
        main.sleepTimer(2000);
        
        String multipliedMessage = "Here are the values for the 2-D arrays after multiplication.\n\n";
        main.printMessage(multipliedMessage);
        intArray3 = multiply2D(intArray, intArray2, intArray3);
        displayArray(intArray3);
        main.sleepTimer(2000);
    
    }
    
    public int[][] multiply2D (int[][] array1, int[][] array2, int[][] array3) {
        
        for(int i = 0; i < array1.length; i++) {
            for(int j = 0; j < array1[i].length; j++) {
                array3[i][j] = array1[i][j] * array2[i][j];
            }
        }
        return array3;
    }
    
    public int[][] initializeArray (int[][] array) {
        // array = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                array[i][j] = rand.nextInt(100);
            }
        }
        return array;
    }
    
    public void displayArray (int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public void initiateLongestSequence(Main main) throws InterruptedException {
        
        int[] intArray = new int[10];
        
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = rand.nextInt(100);
        }
        
        String message = "This method creates an array of size 10 and randomly assigns it values between 0 and 100.\n" +
                         "Here are the values for the array.\n" + Arrays.toString(intArray) + "\n\n"; 
        main.printMessage(message);
        
        int longest = longestSequence(intArray);
        String longMessage = "The longest sequence of consecutive increments in the array was " + longest + "\n\n";
        main.printMessage(longMessage);
        
        Arrays.sort(intArray);
        String sortedMessage = "Here is the same array sorted in acsending format:\n" + Arrays.toString(intArray) + "\n\n";
        main.printMessage(sortedMessage);
        
        longest = longestSequence(intArray);
        String longMessage2 = "The longest sequence of consecutive increments in the sorted array was " + longest + "\n\n";
        main.printMessage(longMessage2);
        
        main.setHasPassedOnce(true);
    }
    
    public int longestSequence(int[] intArray) throws InterruptedException {
        
        ArrayList<Integer> al = new ArrayList<>();
        int count = 0;
        
        for (int i = 0; i < intArray.length - 1; i++) {
            if(intArray[i] < intArray[i + 1] && i + 1 <= intArray.length - 1) {
                count++;
                al.add(count);
            }
            if(intArray[i] > intArray[i + 1] && i + 1 <= intArray.length - 1) {
                count = 0;
            }
        }
        
        int highest = 0;
        for(int i = 0; i < al.size() - 1; i++) {
            if(al.get(i) > al.get(i + 1) && i + 1 <= (al.size() - 1)) {
                highest = al.get(i);
            }else if(al.get(i) < al.get(i + 1) && i + 1 <= (al.size() - 1)) {
                highest = al.get(i + 1);
            }else{
                highest = al.get(i);
            }
        }
        return highest;
    }
}






