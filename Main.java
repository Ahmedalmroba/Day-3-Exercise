import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       /* 1.Write a program that checks the role of the user
        If the role is admin print "welcome admin"
        If the role is superuser print "welcome superuser"
        If the role is user print "welcome user" (tip:
        use if else)*/
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the role: ");
        String role = input.nextLine();
        if (role.equalsIgnoreCase("admin")) {
            System.out.println("Welcome admin");
        } else if (role.equalsIgnoreCase("superuser")) {
            System.out.println("Welcome superuser");
        } else if (role.equalsIgnoreCase("user")) {
            System.out.println("Welcome user");
        } else {
            System.out.println("Unknown ");
        }
        /*2.Take three numbers from the user and print the greatest number.
                Test Data
        Input the 1st number: 25
        Input the 2nd number: 78
        Input the 3rd number: 87
        Expected Output : The
        greatest: 87*/
        System.out.println("Input the 1st number ");
        int number1 = input.nextInt();
        System.out.println("Input the 2st number ");
        int number2 = input.nextInt();
        System.out.println("Input the 3st number ");
        int number3 = input.nextInt();
        int greatestNumber;
        if (number1 >= number2 && number1 >= number3) {
            greatestNumber = number1;
        } else if (number2 >= number1 && number2 >= number3) {
            greatestNumber = number2;
        } else {
            greatestNumber = number3;
        }
        System.out.println("The greatest number is: " + greatestNumber);
/*3.Write a Java program that generates an integer between 1 and 7 and
displays the name of the weekday.
Test Data
number: 4
Expected Output:
Wednesday */
        System.out.println("Enter a number of day from 1 to 7 ");
        int dayNumber = input.nextInt();
        switch (dayNumber) {
            case 1:
                System.out.println("Sunday ");
                break;
            case 2:
                System.out.println("Monday ");
                break;
            case 3:
                System.out.println("Tuesday ");
                break;
            case 4:
                System.out.println("Wednesday ");
                break;
            case 5:
                System.out.println("Thursday ");
                break;
            case 6:
                System.out.println("Friday ");
                break;
            case 7:
                System.out.println("Saturday ");
                break;
            default:
                System.out.println("cannot be found  ");
        }
/*4. Write a program that takes a numeric score as input and prints the
corresponding letter grade using the following grading scale:
A: 90-100
B: 80-89
C: 70-79
D: 60-69
F: 0-59
Enter your numeric score: 85
Numeric Score: 85
Letter Grade: B */
        System.out.println("please  Entre the numeric");
        int number = input.nextInt();
        if (number >= 90 && number <= 100) {
            System.out.println("A");
        } else if (number >= 80 && number < 90)
            System.out.println("B");
        else if (number >= 70 && number < 80)
            System.out.println("C");
        else if (number >= 60 && number < 70)
            System.out.println("D");
        else if (number >= 0 && number < 60)
            System.out.println("F");
        else
            System.out.println("Invalid");
        /*5. Write a Java program that takes a person's age as input and
        categorizes them into one of three age categories: "Child,"
        "Teenager," or "Adult" using an if statement.
                use an if statement to categorize the age based on the following criteria:
• If the age is less than 13, categorize them as a "Child."
• If the age is between 13 and 19 (inclusive), categorize them as a
        "Teenager."
• If the age is 20 or older, categorize them as an "Adult."
        Sample Output:
        Enter your age: 25
        You are an Adult.*/

        System.out.print("Enter the age: ");
        int age = input.nextInt();
        if (age < 13) {
            System.out.println("Child");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Teenager");
        } else {
            System.out.println("Adult");}}}
