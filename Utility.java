import java.util.Scanner;

public class Utility {

    public static void main(String[] args) {

//        int[] newarray = {81, 10, 21, 61, 1, 3, 19, 28, 50};
//        printArray("The array before sorting: ", newarray);
//        selectionSort(newarray);
//        insertionSort(newarray);
//        insertionSortDesc(newarray);
//        selectionSortDesc(newarray);
//        printArray("The array after sorting: ", newarray);
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number you want to find in the array: ");
//        int key = sc.nextInt();
//        linearSearch(newarray, key);
//        binarySearch(newarray, key);
//        takeArrayInputAndSort();
    }

    static void printArray(String prompt, int[] numbers) {
        System.out.print(prompt);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ", ");
        }
        System.out.println();
    }

    static void selectionSort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int smallest = i;
            for (int j = 0; j < i + 1; j++) {
                if (numbers[j] < numbers[smallest]) {
                    smallest = j;
                }
                assert smallest > i && smallest < numbers.length;
                int temp = numbers[smallest];
                numbers[smallest] = numbers[i];
                numbers[i] = temp;
            }
            printArray("pass" + (i + 1) + ": ", numbers);
        }
    }

    static void selectionSortDesc(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int largest = i;
            for (int j = 0; j < i + 1; j++) {
                if (numbers[j] > numbers[largest]) {
                    largest = j;
                }
                assert largest > i && largest < numbers.length;
                int temp = numbers[largest];
                numbers[largest] = numbers[i];
                numbers[i] = temp;
            }
            printArray("pass" + (i + 1) + ": ", numbers);
        }
    }

    static void insertionSort(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            int temp = numbers[i];
            int j;
            for (j = i - 1; j >= 0 && temp < numbers[j]; j--) {
                numbers[j + 1] = numbers[j];
            }
            assert j == -1 || numbers[j] < temp;
            numbers[j + 1] = temp;
            printArray("Pass" + (i) + ": ", numbers);
        }
    }

    static void insertionSortDesc(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            int temp = numbers[i];
            int j;
            for (j = i - 1; j >= 0 && temp > numbers[j]; j--) {
                numbers[j + 1] = numbers[j];
            }
            assert j == -1 || numbers[j] < temp;
            numbers[j + 1] = temp;
            printArray("Pass" + (i) + ": ", numbers);
        }
    }

    static int linearSearch(int[] numbers, int key) {
        boolean found = false;
        int i = 0;
        while (i < numbers.length && !found) {
            if (numbers[i] == key) {
                found = true;
            } else {
                i++;
            }
        }
        if (found) {
            System.out.println("The number " + key + " is found in the array at index " + i);
            return 1;
        } else {
            System.out.println("The number " + key + " is not found in the array");
            return -1;
        }
    }

    static int binarySearch(int[] numbers, int key) {

        int upperBound = numbers.length - 1;
        int lowerBound = 0;
        int mid = -1;
        boolean found = false;

        while (!found && lowerBound <= upperBound) {
            mid = (lowerBound + upperBound) / 2;
            if (numbers[mid] == key) {
                found = true;
            } else if (numbers[mid] > key) {
                upperBound = mid - 1;
            } else {
                lowerBound = mid + 1;
            }
        }

        assert (lowerBound > upperBound || found);

        if (found) {
            System.out.println("The number " + key + " is found in the array at index " + mid);
            return mid;
        } else {
            System.out.println("The number " + key + " is not found in the array");
            return -1;
        }
    }

    static void takeArrayInputAndSort() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to add to the array!");
        int noOfElements = sc.nextInt();
        int[] inputArray = new int[noOfElements];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < noOfElements; i++) {
            System.out.print("Enter value #" + (i + 1) + " of the array: ");
            inputArray[i] = sc.nextInt();
        }
        printArray("The array before sorting: ", inputArray);
        System.out.println("Do you want to sort the array in descending order or ascending order? Enter 1 for ascending and -1 for descending. ");
        int ascORdesc = sc.nextInt();
        if(ascORdesc == 1) {
            selectionSort(inputArray);
        }
        else{
            selectionSortDesc(inputArray);
        }
        printArray("The array after sorting by selection sort: ", inputArray);
    }
}



