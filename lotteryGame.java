import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class lotteryGame {
    public static void main(String[] args) {
       String randomticket = generateRandom();
       String userticket = userTicketNumber();

       if (userticket.equals(String.valueOf(randomticket))) {
           System.out.println("Congratulations! You have one the first price of the lottery!");
       }
       else{
           System.out.println("Sorry, you have no price of the lottery!");
           System.out.println(randomticket + " , " + userticket);
       }
    }

    static String generateRandom(){
        Random random = new Random();
        String randomNumber="";
        for (int i = 0; i < 7; i++) {
            randomNumber += random.nextInt(34) + 1;
        }
        return randomNumber.toString();
    }

    static String  userTicketNumber(){
        Scanner scanner = new Scanner(System.in);
        int [] ticketNumber = new int[7];
        System.out.println("Enter the seven numbers of your lottery ticket one by one:");
        for(int i=0; i<ticketNumber.length; i++){
            System.out.print("Enter number " + (i+1) + ": ");
            ticketNumber[i] = scanner.nextInt();
        }
        Utility.selectionSort(ticketNumber);
        StringBuilder sb = new StringBuilder();
        for (int num : ticketNumber) {
            sb.append(num);
        }
        String result = sb.toString();
        return result;
    }
}
