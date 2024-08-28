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

        System.out.println("Enter a number to print it's factorial!");
        Scanner sc = new Scanner(System.in);
        int user_input = sc.nextInt();
        int factorial = 1;

        for(int i = 1; i<= user_input ; i++) {
            factorial *= i;
        }

        System.out.println(factorial);













































    }
}
