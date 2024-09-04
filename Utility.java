public class Utility {

    public static void main(String[] args) {

        int[] newarray = {81,10,21,61,1,3,19,28,50};
        printArray("The array before sorting: ", newarray);
//        selectionSort(newarray);
        insertionSort(newarray);
        printArray("The array after sorting: ", newarray);

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

    static void printArray(String prompt, int[] numbers) {
        System.out.println(prompt);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ", ");
        }
        System.out.println();
    }

    static void insertionSort(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {  // i=1 ,2
            int temp = numbers[i];   //temp=10
            int j;
            for (j = i-1; j >= 0 && temp < numbers[j] ; j--) {  // j=0 ,1
                numbers[j+1] = numbers[j];
            }
            assert j == -1 || numbers[j] < temp;
            numbers[j+1] = temp;      //temp =10
            printArray("Pass" + (i) + ": ", numbers);
        }
    }


}
