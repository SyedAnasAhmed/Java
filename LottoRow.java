import java.util.Random;
import java.util.Scanner;

public class LottoRow {

    final int SMALLEST_NUMBER = 1;
    final int LARGEST_NUMBER = 34;
    final int MAX_SIZE = 7;

    int[] inputLotto() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type your 7 lotto numbers one by one. The numbers should be greater than 0 and less than 35");
        int[] userLotto = new int[MAX_SIZE];
        for (int i = 0; i <= MAX_SIZE - 1; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            userLotto[i] = sc.nextInt();
            if (userLotto[i] > LARGEST_NUMBER) {
                System.out.print("Invalid Number, enter a number below 35!");
                userLotto[i] = sc.nextInt();
            } else if (userLotto[i] < SMALLEST_NUMBER) {
                System.out.print("Invalid number, enter a number above 0!");
                userLotto[i] = sc.nextInt();
            }
        }
        return userLotto;
    }

    int[] randomLotto() {
        Random rand = new Random();
        int[] numbers = new int[MAX_SIZE];
        for (int i = 0; i < 7; i++) {
            numbers[i] = rand.nextInt(34) + 1; // Generates numbers from 1 to 34
        }
        return numbers;
    }

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LottoRow user = new LottoRow();
        int[] array = user.inputLotto();
        printArray(array);
        int[] randomarray = user.randomLotto();
        printArray(randomarray);
    }
}