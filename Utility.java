public class Utility {

    public static void main(String[] args) {

        int[] newarray = {10, 15, 2, 9, 31, 6, 8, 20, 12, 19};
        printArray("The array before sorting: ", newarray);
        selectionSort(newarray);
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



}
