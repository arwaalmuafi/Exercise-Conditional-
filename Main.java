import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        1.Write a program that checks the role of the user
If the role is admin print "welcome admin"
If the role is superuser print "welcome superuser" If the role is user print "welcome user" (tip:
use if else)

         */

//        System.out.println("please enter your role");
//        String role = input.nextLine();
//
//        if (role.startsWith("admin")){
//            System.out.println("welcome admin");
//
//        }else if (role.startsWith("superuser")){
//            System.out.println("welcome superuser");
//
//        }else if (role.startsWith("user")){
//            System.out.println("welcome user");
//        } else System.out.println("please enter availed role");
//
//
//
//






        /*
        2.Take three numbers from the user and print the greatest number.
Test Data
Input the 1st number: 25 Input the 2nd number: 78 Input the 3rd number: 87
Expected Output : The greatest: 87
         */

//        System.out.println("please enter number 1");
//        int num1 = input.nextInt();
//        System.out.println("please enter number 2");
//        int num2 = input.nextInt();
//        System.out.println("please enter number 3");
//        int num3 = input.nextInt();
//
//        if (num1 > num2) {
//            System.out.println("large number is num1");
//
//        } else if (num1 > num3) {
//            System.out.println("large number is num2");
//
//        } else System.out.println("large number is num3");

        /*
        3.Write a Java program that generates an integer between 1 and 7 and displays the name of the weekday.
Test Data
number: 4
Expected Output:
Wednesday
         */
//
//        System.out.print("please enter your day number: ");
//        int number = input.nextInt();
//
//        switch (number) {
//            case 1:
//                System.out.println("sunday");
//                break;
//            case 2:
//                System.out.println("monday");
//            case 3:
//                System.out.println("tuesday");
//                break;
//            case 4:
//                System.out.println("wednesday");
//                break;
//            case 5:
//                System.out.println("thursday");
//                break;
//            case 6:
//                System.out.println("friday");
//                break;
//            case 7:
//                System.out.println("saturday");
//            default:
//                System.out.println("please enter numbers from 1 to 7 only");



        /*
        4. Write a program that takes a numeric score as input and prints the
        corresponding letter grade using the following grading scale:
A: 90-100 B: 80-89
C: 70-79
D: 60-69 F: 0-59
Enter your numeric score: 85 Numeric Score: 85
Letter Grade: B
         */


//        System.out.print("please enter your grade: ");
//        int grade = input.nextInt();
//
//        if (grade >= 90 && grade < 100) {
//            System.out.println("*******************************");
//            System.out.println("your grade is A");
//        } else if (grade >= 80 && grade < 89) {
//            System.out.println("*******************************");
//            System.out.println("your grade is B");
//        } else if (grade >= 70 && grade < 79) {
//            System.out.println("*******************************");
//            System.out.println("your grade is C");
//        } else if (grade >= 60 && grade < 69) {
//            System.out.println("*******************************");
//            System.out.println("your grade is F");
//        } else System.out.println("0");




        /*
        5. Write a Java program that takes a person's age as input and categorizes
         them into one of three age categories: "Child," "Teenager," or "Adult" using an if statement.
use an if statement to categorize the age based on the following criteria:
• If the age is less than 13, categorize them as a "Child."
• If the age is between 13 and 19 (inclusive), categorize them as a "Teenager."
• If the age is 20 or older, categorize them as an "Adult."
Sample Output: Enter your age: 25 You are an Adult.
         */
//        System.out.println("please enter your age:");
//        int age = input.nextInt();
//
//        if (age < 13) {
//            System.out.println("child");
//
//        } else if (age >= 13 && age <= 19) {
//            System.out.println("teenager");
//        }else if (age >= 20){
//            System.out.println("adult");
//        }else System.out.println("please enter age ");

    }
}
