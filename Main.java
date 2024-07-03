import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q1) 1.Write a program that prints the numbers from 1 to 100 such that:
        //If the number is a multiple of 3, you need to print "Fizz" instead of that
        //number.
        //If the number is a multiple of 5, you need to print "Buzz" instead of that
        //number.
        //If the number is a multiple of both 3 and 5, you need to print "FizzBuzz"
        //instead of that number.

//        System.out.println("Hello they here our program  ");
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else System.out.println(i);;
//        }

        //Q2) Write a Java program to reverse a string.
        //Test Data: Input a string: The quick brown fox Expected Output: Reverse
        //string: xof nworb kciuq ehT

//        System.out.println("Please Enter your sentence to reverse it : ");
//        String sentence = sc.nextLine();
//        String revers = "";
//        for (int i =sentence.length()-1;i>=0;i--){
//            revers += sentence.charAt(i);
//        }
//        System.out.println("This is the sentence after reversing : " + revers);


        //Q3) 3.Write a program to find the factorial value of any number entered
        //through the keyboard.

//        System.out.println("Please chose a number : ");
//        int num = sc.nextInt();
//        int sum = 1;
//        for (int i = 1; i <= num; i++) {
//            sum *= i;
//        }
//        System.out.println("The factorial is : " + sum);

        //Q4) Two numbers are entered through the keyboard. Write a program to find
        //the value of one number raised to the power of another. (Do not use Java
        //built-in method)

//        System.out.println("Please write first number : ");
//        int num = sc.nextInt();
//        System.out.println("Enter power of your number : ");
//        int power = sc.nextInt();
//
//        int sum =1;
//        for(int i = 1; i<=power;i++){
//           sum*=num;
//        }
//        System.out.println("The power of :"+num+" is: "+sum);

        //Q5) Write a program that reads a set of integers, and then prints the sum of
        //the even and odd integers.

//        System.out.println("Please enter number of Integer : ");
//        int n = sc.nextInt();
//
//        int even = 0;
//        int odd = 0;
//
//        System.out.println("Please enter " + n + " number :");
//        for (int i = 1; i <= n; i++) {
//            int num = sc.nextInt();
//            if (num % 2 == 0) {
//                even += num;
//            } else {
//                odd += num;
//            }
//        }
//        System.out.println("The sum of even number is : " + even);
//        System.out.println("The sum of odd number is  : " + odd);

        //Q6) 6.Write a program that prompts the user to input a positive integer. It
        //should then output a message indicating whether the number is a prime
        //number.

//        System.out.println("Please enter positive integer :");
//        int num = sc.nextInt();
//
//        boolean isPrime = true;
//
//        if (num <= 1) {
//            isPrime = false;
//        } else {
//            for (int i = 2; i < Math.sqrt(num); i++) {
//                if (num % 2 == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//        }
//        if (isPrime) {
//            System.out.println("The number " + num + " is prime ");
//        } else {
//            System.out.println("The number :" + num + " is not prime ");
//        }

        //Q7) .Use a for loop to print headings for four weeks (Weeks 1 - 4). Then use
        //another for loop to print the days (Days 1 -7) for each week.

//        for (int week = 1; week < 5; week++) {
//            System.out.println("week " + week);
//            for (int day = 1; day < 8; day++) {
//                System.out.println("day " + day);
//            }
//        }

        //Q8) Write a program thats check if the word is a palindrome or not. hint: A
        //string is said to be a palindrome if it is the same if we start reading it from
        //left to right or right to left.

//        System.out.println("Enter your world : ");
//        String world = sc.nextLine().toLowerCase();
//
//        boolean isPalindrome = true;
//        int length = world.length();
//        for (int i = 0; i < length / 2; i++) {
//            if (world.charAt(i) != world.charAt(length - i - 1)) {
//                isPalindrome = false;
//                break;
//            }
//        }
//        if (isPalindrome) {
//            System.out.println("The world " + world + " is palindrome");
//        } else {
//            System.out.println("The world " + world + " is not palindrome");
//        }

    }

}
