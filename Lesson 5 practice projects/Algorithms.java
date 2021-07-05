import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.List;

public class Algorithms {
    
    public void isPresent(Integer[] array, Main main) throws InterruptedException {
        
        Scanner scan = new Scanner(System.in);
        
        String message = "This method checks to see if an element is present within the array. Here is the array.\n";
        main.printMessage(message);
        
        String arrayMessage = Arrays.toString(array) + "\n\n";
        main.printMessage(arrayMessage);
        
        String promptMessage = "Key in a number in the array to search for.\n";
        main.printMessage(promptMessage);
        
        Integer index = 0;
        Integer input = 0;
        
        try {
            input = scan.nextInt();
            List<Integer> list = Arrays.asList(array);
            index = (Integer)list.indexOf(input);
            if (index  == -1) {
            	main.printMessage("There was no value matching this entry\n\n");
            }else {
            	main.printMessage("Entry found at index " + (index + 1) + "\n\n");
            }
        } catch(InputMismatchException e) {
            String errMessage = "Invalid entry. You must enter an Integer. Start over.\n\n";
            main.printMessage(errMessage);
            isPresent(array, main);
        } finally {
        }
        
        main.setHasPassedOnce(true);
        scan.close();
    }
    
    public void initiateLinearSearch(Integer[] array, Main main) throws InterruptedException {
        
        Scanner scan = new Scanner(System.in);
        
        String message = "This process performs a Linear search for an element in the array. Here is the array.\n";
        main.printMessage(message);
        
        String arrayMessage = Arrays.toString(array) + "\n\n";
        main.printMessage(arrayMessage);
        
        String promptMessage = "Key in a number in the array to search for.\n";
        main.printMessage(promptMessage);
        
        Integer index = 0;
        Integer input = 0;
        
        try {
            input = scan.nextInt();
            index = linearSearch(array, input);
            if (index  < 0) {
            	main.printMessage("There was no value matching this entry\n\n");
            }else {
            	main.printMessage("Entry found at index " + (index + 1) + "\n\n");
            }
        } catch(InputMismatchException e) {
            String errMessage = "Invalid entry. You must enter an Integer. Start over.\n\n";
            main.printMessage(errMessage);
            initiateExponentialSearch(array, main);
        } finally {
        }
        
        main.setHasPassedOnce(true);
        scan.close();
    }
    
    public Integer linearSearch(Integer[] input, Integer value) {
        for (Integer i = 0; i < input.length; i++) {
            if (input[i] == value) {
                return i;
            }
        }

        return -1;
    }
    
    public void initiateBinarySearch(Integer[] array, Main main) throws InterruptedException {
        
        Scanner scan = new Scanner(System.in);
        
        String message = "This process performs a Binary search for an element in the array. It uses a standard algorithm\n" +
                         "from the class Arrays and must sort the array before searching. Here is the array.\n";
        main.printMessage(message);
        
        Arrays.sort(array);
        String arrayMessage = Arrays.toString(array) + "\n\n";
        main.printMessage(arrayMessage);
        
        String promptMessage = "Key in a number in the array to search for.\n";
        main.printMessage(promptMessage);
        
        Integer index = 0;
        Integer input = 0;
        
        try {
            input = scan.nextInt();
            index = Arrays.binarySearch(array, input);
            if (index  < 0) {
            	main.printMessage("There was no value matching this entry\n\n");
            }else {
            	main.printMessage("Entry found at index " + (index + 1) + "\n\n");
            }
        } catch(InputMismatchException e) {
            String errMessage = "Invalid entry. You must enter an Integer. Start over.\n\n";
            main.printMessage(errMessage);
            initiateExponentialSearch(array, main);
        } finally {
        }
        
        main.setHasPassedOnce(true);
        scan.close();
    }
    
    public void initiateExponentialSearch(Integer[] array, Main main) throws InterruptedException {
        
        Scanner scan = new Scanner(System.in);
        
        String message = "This process performs an exponential search for an element in the array. Here is the array.\n";
        main.printMessage(message);
        
        String arrayMessage = Arrays.toString(array) + "\n\n";
        main.printMessage(arrayMessage);
        
        String promptMessage = "Key in a number in the array to search for.\n";
        main.printMessage(promptMessage);
        
        Integer index = 0;
        Integer input = 0;
        
        try {
            input = scan.nextInt();
            index = exponentialSearch(array, array.length, input);
            if (index  < 0) {
            	main.printMessage("There was no value matching this entry\n\n");
            }else {
            	main.printMessage("Entry found at index " + (index + 1) + "\n\n");
            }
        } catch(InputMismatchException e) {
            String errMessage = "Invalid entry. You must enter an Integer. Start over.\n\n";
            main.printMessage(errMessage);
            initiateExponentialSearch(array, main);
        } finally {
        }
        
        main.setHasPassedOnce(true);
        scan.close();
    }
    
    public Integer exponentialSearch(Integer array[], Integer n, Integer x) throws InterruptedException {

        if (array[0] == x) {
            return 0;
        }
        
        Integer i = 1;
        while (i < n && array[i] <= x) {
            i = i*2;
        }
        
        return findIndex(array, x);
    }
    
    public int findIndex(Integer[] array, Integer value) {
        
        for(int i = 0; i < array.length; i++) {
            if(array[i] == value) {
                return i;
            }
        }
        return -1;
    }
    
    public void initiateSelectionSort(Integer[] array, Main main) throws InterruptedException {
        
        String message = "This process performs a selection sort on an array. Here is the array.\n";
        main.printMessage(message);
        
        String arrayMessage = Arrays.toString(array) + "\n\n";
        main.printMessage(arrayMessage);
        
        Integer[] sortedArray = selectionSort(array);
        String promptMessage = "The array after the selection sort\n" + Arrays.toString(sortedArray) + "\n\n";
        main.printMessage(promptMessage);
        
        main.setHasPassedOnce(true);
    }
    
    public Integer[] selectionSort(Integer[] array) {
        
        for(Integer j = array.length - 1; j > 0; j--) {
            Integer largest = 0;
            for (Integer i = 1; i <= j; i++){
                if(array[largest] < array[i]){
                    largest = i;
                }
            }
            swap(array, largest, j);
        }
        return array;
    }
    
    public void initiateBubbleSort(Integer[] array, Main main) throws InterruptedException {
        
        String message = "This process performs a bubble sort on an array. Here is the array.\n";
        main.printMessage(message);
        
        String arrayMessage = Arrays.toString(array) + "\n\n";
        main.printMessage(arrayMessage);
        
        Integer[] sortedArray = bubbleSort(array);
        String promptMessage = "The array after the bubble sort\n" + Arrays.toString(sortedArray) + "\n\n";
        main.printMessage(promptMessage);
        
        main.setHasPassedOnce(true);
    }
    
    public Integer[] bubbleSort(Integer[] array) {
        
        for (int j = array.length - 1; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                if(array[i] > array[i + 1]) {
                    swap (array, i, i + 1);
                }
            }
        }
        return array;
    }
    
    public void swap (Integer[] array, Integer i, Integer j) {
        if(i == j) {
            return;
        }
        
        Integer temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    public void initiateInsertionSort(Integer[] array, Main main) throws InterruptedException {
        
        String message = "This process performs an insertion sort on an array. Here is the array.\n";
        main.printMessage(message);
        
        String arrayMessage = Arrays.toString(array) + "\n\n";
        main.printMessage(arrayMessage);
        
        Integer[] sortedArray = insertionSort(array);
        String promptMessage = "The array after the insertion sort\n" + Arrays.toString(sortedArray) + "\n\n";
        main.printMessage(promptMessage);
        
        main.setHasPassedOnce(true);
    }
    
    public Integer[] insertionSort(Integer[] array) {
        
        for (Integer j = 1; j < array.length; j++) {
            Integer firstUnsorted = array[j];
            Integer i;
            for (i = j; i > 0 && array[i - 1] > firstUnsorted; i--) {
                array[i] = array[i - 1];
            }
            array[i] = firstUnsorted;
        }
        
        return array;
    }
    
    public void initiateMergeSort(Integer[] array, Main main) throws InterruptedException {
        
        String message = "This process performs the merge sort on an array. Here is the array.\n";
        main.printMessage(message);
        
        String arrayMessage = Arrays.toString(array) + "\n\n";
        main.printMessage(arrayMessage);
        
        Integer[] sortedArray = mergeSort(array, 0, array.length);
        String promptMessage = "The array after the merge sort\n" + Arrays.toString(sortedArray) + "\n\n";
        main.printMessage(promptMessage);
        
        main.setHasPassedOnce(true);
    }
    
    public Integer[] mergeSort(Integer[] array, Integer start, Integer end) {
        
        if(end - start < 2){
            return null;
        }
        
        Integer mid = (start + end) / 2;
        mergeSort(array, start, mid);
        mergeSort(array, mid, end);
        merge(array, start, mid, end);
        return array;
    }
        
    public void merge(Integer[] array, Integer start, Integer mid, Integer end) {
        
        if(array[mid - 1] <= array[mid]) {
            return;
        }
        
        Integer i = start;
        Integer j = mid;
        Integer tempIndex = 0;
        Integer[] temp = new Integer[end - start];
        while(i < mid && j < end){
            temp[tempIndex++] = array[i] <= array[j] ? array[i++] : array[j++];
            // temp[tempIndex] = array[i] <= array[j] ? array[i] : array[j];
            // tempIndex++;
            // i++;
            // j++;
        }
        
        System.arraycopy(array, i, array, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, array, start, tempIndex);
    }
    
    public void initiateQuickSort(Integer[] array, Main main) throws InterruptedException {
        
        String message = "This process performs the quick sort on an array. Here is the array.\n";
        main.printMessage(message);
        
        String arrayMessage = Arrays.toString(array) + "\n\n";
        main.printMessage(arrayMessage);
        
        Integer[] sortedArray = quickSort(array, 0, array.length);
        String promptMessage = "The array after the quick sort\n" + Arrays.toString(sortedArray) + "\n\n";
        main.printMessage(promptMessage);
        
        main.setHasPassedOnce(true);
    }
    
    public Integer[] quickSort(Integer[] input, int start, int end) {
        
        if (end - start < 2) {
            return null;
        }

        int pivotIndex = partition(input, start, end);
        
        quickSort(input, start, pivotIndex);
        
        quickSort(input, pivotIndex + 1, end);
        return input;
    }

    public int partition(Integer[] input, int start, int end) {

        int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j) {
            while (i < j && input[--j] >= pivot);
                if (i < j) {
                    input[i] = input[j];
                }

            while (i < j && input[++i] <= pivot);
                if (i < j) {
                    input[j] = input[i];
                }
            }
        input[j] = pivot;
        return j;
    }
    
}
