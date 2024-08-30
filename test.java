import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        //3.6 Q1
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of seconds");
//        int user_input  = sc.nextInt();
//
//        int hours = user_input / 3600;
//        int mins = (user_input % 3600) / 60;
//        int secs = user_input % 60;
//
//        if (hours == 1){
//            System.out.println("In " + user_input + " seconds, There is" + hours + " hour," + mins + " minutes and " + secs + " seconds");
//        }
//        else {
//            System.out.println("In " + user_input + " seconds, There are " + hours + " hours," + mins + " minutes and " + secs + " seconds");
//
//        }

        //3.6 Q2:

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a lower limit for the interval :  ");
//        int lowerlimit = sc.nextInt();
//        System.out.print("Enter a upper limit for the interval : ");
//        int upperlimit = sc.nextInt();
//        System.out.println("Now enter a number to check where it lies in the interval!");
//        int userinput = sc.nextInt();
//
//        if (userinput > lowerlimit && userinput < upperlimit) {
//            System.out.println("The value " + userinput + " lies within the interval : [" + lowerlimit + "," + upperlimit + "]");
//        }
//        else {
//            System.out.println("The value " + userinput + " does not lie in the interval : [" + lowerlimit + "," + upperlimit + "]");
//        }


//        3.6 Q4

//        Scanner sc  = new Scanner(System.in);
//        System.out.println("How many numbers will you enter? ");
//        int n = sc.nextInt();
//        int sum=0;
//        int i = 0;
//
//        do {
//            System.out.println("Enter a number");
//            int userinput = sc.nextInt();
//            sum = sum + userinput;
//            i++;
//        }
//        while (  i<n  );
//
//        System.out.println(sum);


//        String name = " y            Syed Anas Ahmed         ! " ;
//        System.out.println(name.trim());

//        Scanner input = new Scanner("101  25.0  2006");
//        int code = input.nextInt();
//        double salestax = input.nextDouble();
//        long year = input.nextLong();
//
//        System.out.println(code);
//        System.out.println(year);
//        System.out.println(salestax);

/*
        String newvar = new String(  "Anas Ahmed") ;
        newvar = "Syed Anas Ahmed";
        System.out.println(newvar);*/

//        System.out.println("Enter a sentence");
//        Scanner sc = new Scanner(System.in);
//        String userinput = sc.nextLine();
//
//        System.out.println(userinput);


        //Creating object of a primitive data type.
//        Integer autobox = 12;
//        System.out.println(autobox);
//
//        int autounbox = autobox;
//        System.out.println(autounbox);


//        Integer tester  = 15;
//        int newtest = tester;
//        newtest = 18;
//
//        System.out.println(tester + "   " + newtest);


//        String name = "Anas";
//        String noname = "Anas" ;
//        boolean check = name.equals(noname);
//
//        System.out.println(check);
//        if (name == noname){
//            System.out.println("barabar");
//        }
//        else{
//            System.out.println("do barabar");
//        }

//        String name = "Syed Anas Ahmed";
//        int index1 = name.indexOf(" ");

//        char why = 'z';
//        String nowhy = "z";
//
//        System.out.println(nowhy.equals(why));

        //printing an acronym problem//

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a line.");
//        String input = sc.nextLine();
//
//        StringBuilder acronym  =  new StringBuilder();
//
//        if (input.length() > 0 ){
//            acronym.append(input.charAt(0));
////            System.out.println("aya");/
//        }
//
//        int i = 1;
//        while (i < input.length()){
//            if (input.charAt(i) == ' ' && i+1<input.length()){
//                acronym.append(input.charAt(i+1));
//            }
//            i++;
//        }
//
//        System.out.println(acronym.toString().toUpperCase());


        //Pallindrome
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a word/numbers");
//        String user_input = sc.nextLine();
//        String pallindrome = "";
//
//        for (int i = user_input.length() -1 ; i >= 0 ; i--){
//            pallindrome += user_input.charAt(i);
//        }
//
//        if (pallindrome.equals(user_input)){
//            System.out.println("The given string is a pallindrome");
//        }
//        else {
//            System.out.println("The given string is not a pallindrome");
//        }


        //factorial:
//
//        System.out.println("Enter a number to print it's factorial!");
//        Scanner sc = new Scanner(System.in);
//        int user_input = sc.nextInt();
//        int factorial = 1;
//
//        for(int i = 1; i<= user_input ; i++) {
//            factorial *= i;
//        }
//
//        System.out.println(factorial);


        //multi dimensional array:

//        int[][] weeklydata = {{10, 23, 31, 54, 53, 24, 42}, {37, 85, 55, 34, 23, 65, 34}, {24, 42, 75, 67, 43, 102, 57}};

//        for (int phoneIndex = 0; phoneIndex < weeklydata.length; phoneIndex++) {
//            System.out.print("Phone Index: " + phoneIndex + ":");
//
//            for (int dayindex = 0; dayindex < weeklydata[phoneIndex].length; dayindex++) {
//                System.out.printf("%4d", weeklydata[phoneIndex][dayindex]);
//            }
//            System.out.println();
//        }

//        int sum = 0;
//        for (int i = 0; i < weeklydata[2].length; i++) {
//            sum += weeklydata[2][i];
//        }
//        System.out.println(sum);

//
//        int sum = 0;
//        for (int i = 0; i < weeklydata.length; i++) {
//            sum += weeklydata[i][2];
//        }
//
//        System.out.println(sum);

//        int sum = 0;
//        for (int i = 0; i < weeklydata.length; i++) {
//            for (int j = 0; j < weeklydata[i].length; j++) {
//                if (weeklydata[i][j] > 100) {
//                    System.out.println("The mobile phone " + i + " has messages greater than 100 on day " + j);
//                }
//            }
//        }

//        int[] numbers = {3, 9, 5, -5};
//        for (int i : numbers) {
//            System.out.println(i);
//        }


        // Partially filled arrays:

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a set of words to make a sentence and enter 'EOL' as a termination statement");
//        String [] sentence = new String[50];
//
//        int wordindex = -1;
//        String word = sc.next();
//
//        for(int i =0 ; i < sentence.length; i++){
//            if ( !word.equals("EOL")){
//                sentence[i]  = word;
//                wordindex++;
//                word = sc.next();
//            }
//        }
//        int wordcount = wordindex + 1;
//        System.out.println(wordcount);
//
//        for (int i = 0; i <wordcount ; i++ ){
//            System.out.print(sentence[i] + "  ");
//        }

        //Digit Frequency Problem//
//
//        int[] digitFrequency = new int[10];
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter positive integers, enter a negative integer to terminate.");
//        int input = sc.nextInt();
//
//        while (input >= 0 && input < 10) {
//            digitFrequency[input]++;
//            input = sc.nextInt();
//        }
//
//        for (int i = 0; i < digitFrequency.length; i++) {
//            if (digitFrequency[i] > 0) {
//                System.out.println(i + " occurs " + digitFrequency[i] + " times.");
//            }
//        }

//              Extended version of above problem:

//        int[] digitFrequency = new int[10];
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter positive integers, enter a negative integer to terminate.");
//        int input = sc.nextInt();
//
//        while (input >= 0 && input < 10) {
//            digitFrequency[input]++;
//            input = sc.nextInt();
//        }
//
//        for (int i = 0; i < digitFrequency.length; i++) {
//            System.out.print(i + ":");
//            if (digitFrequency[i] > 0) {
//                for (int j = 0; j <= digitFrequency[i]; j++) {
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//        }

        //  chap 6 Ques 4:

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter 10 integers");
//        int[] userinput = new int[10];
//
//        for (int i = 0; i < userinput.length; i++) {
//            userinput[i] = sc.nextInt();
//        }
//        System.out.println("10 integers completed");
//
//        for (int i = 0; i < userinput.length; i++) {
//            System.out.print(userinput[i] + ",");
//        }
//        System.out.println();
//
//        int smallestNumber = userinput[0];
//        int smallestIndex = 0;
//
//        for (int i = 0; i < userinput.length; i++) {
//            if (userinput[i] < smallestNumber) {
//                smallestNumber = userinput[i];
//                smallestIndex = i;
//            }
//        }
//
//        int temp = userinput[0];
//        userinput[0] = userinput[smallestIndex];
//        userinput[smallestIndex] = temp;
//        System.out.println("The smallest number is : " + smallestNumber);
//
//        System.out.print("this is the revised array");
//        for (int i = 0; i < userinput.length; i++) {
//            System.out.print(userinput[i] + ",");
//        }

        // Taking a multi-dimensional array from userinput and then displaying it.

//        int rows = 3;
//        int cols = 7;
//
//        int[][] weeklydataarr =  new int[rows][cols];
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter the weekly data of bla bla");
//
//        for (int i=0; i<rows; i++){
//            for (int j=0; j<cols; j++){
//                weeklydataarr[i][j] = sc.nextInt();
//            }
//        }
//        System.out.println("The prompt has completed");
//
//        for (int i=0; i<rows; i++){
//            for (int j=0; j<cols; j++){
//                System.out.print(weeklydataarr[i][j] + " ");
//            }
//            System.out.println();
//        }

        String[] firstNameArray = createStringArray();
        printAnArray(firstNameArray);
    }

    static String[] createStringArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many names do you want to enter?");
        int arrIndex = sc.nextInt();
        String[] arr = new String[arrIndex];
        for (int i = 0; i < arrIndex; i++) {
            arr[i] = sc.next();
        }
        return arr;
    }

    static void printAnArray(String[] arr){
        for (int i=0; i<arr.length ; i++){
            System.out.print(arr[i] + ", ");
        }
    }
}