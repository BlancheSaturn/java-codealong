
import jdk.swing.interop.SwingInterOpUtils;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        // type variableMame = value;
//        String name = "Charlie Richardson";
//        // sout -> like console.log()
//        System.out.println("Hello " + name);
//
//        // String -> PascalCasing -> class
//
//        // primitives in Java -> lowercase
//        // int, float, boolean, char, double, long, short, byte
//        // each primitive takes up a certain amount of memory
//
//        // WHOLE NUMBERS
//        // byte number between -> -128 -> 127
//
//        byte myByte = 127;
//        //myByte += 10;
//
//        // shorts number between -32,768 -> 32,768
//        short myShort = 1000;
//
//        // 4 byte number type -2,147,483,648 to 2,147,483,647
////        int myInt =  2000000;
//
//        // 4 byte number type -2,147,483,648 to 2,147,483,647
//        // EXPLICIT WHEN YOU DECLARE A LONG
//        long myLong = 8234455677L;
//
//
//        // DECIMAL PLACE / FLOATING POINT NUMBER
//        // float -> 6 to 7 decimal places
//        // EXPLICIT WHEN DECLARING
//
//        float myfloat = 12345.677893F;
//
//        // double up to 15 decimal places
////        double myDouble = 12.234567896754324;
//
//        // boolean & char
//        // true or false
//
//        boolean myBoolean = true;
//        myBoolean = false;
//
//        // char stores a single character
//        // SINGLE QUOTE
//        char myChar = 'A';
//        myChar = 'S';
//
//
//        // we are now declaring the type of the variable
//        // we have done away with const/let
//
//        // control flow
//
////        challenge
////        using an if/else statement....
////        if the age is greater than 21 they can buy alcohol
////        if the age i greater than 18, and the country is the UK, they can buy alcohol
//////        if not then they cannot buy alcohol
//
//////        byte age = 19;
////        String country = "UK";
////        if (age >= 21) {
////            System.out.println("You can buy alcohol");
////        }else if ((age >= 18)  && (country == "UK")) {
////            System.out.println("You can buy alcohol in the UK");
////        } else{
////            System.out.println("You cannot buy alcohol");
////        }
//
//        // SCANNER - The Scanner class is used to get user input,
//        // and it is found in the java.util package.
//        Scanner scanner = new Scanner(System.in); // Create a Scanner object
////        System.out.println("How old are you");
//        short age = scanner.nextShort(); //Read user input
//
//        System.out.println("Do you live in US or the UK");
//        String country = scanner.next();
//        System.out.println(country);
//
//        if (age >= 21) {
//            System.out.println("You can buy alcohol");
//        }else if (age >= 18  && country.equals ("UK")) {
//            System.out.println("You can buy alcohol in the UK");
//        } else{
//            System.out.println("You cannot buy alcohol");
//        }
//
//        // Type Casting
//        // implicit - if we add two numbers together of different type,
//        // the new variable will take the type of the largest type
//        // byte + int = int
//        // short + int = int
//        // Implicit casting follows the order of conversion as shown below:
//        // Byte -> Short -> Char -> Int -> Long -> Float -> Double
//
//        int myInt = 9;
//        double myDouble = myInt; // Automatic casting: int to double
//
//        System.out.println(myInt);      // Outputs 9
//        System.out.println(myDouble);   // Outputs 9.0

//        byte  samsByte = 90;
//        short samsShort = 1000;
//        int newNum = samsByte + samsShort; // automatically will be an int which is the bigger type
        // counteract by making explicit
//       // short newNum = (short) (samsByte + samShort);

//        int samsInt = 3;
//        double samsDouble = 4.3;
//        // Java creates a temporary value of 3.0 (that is the corresponding double value).
//        // /It then adds this temporary value to the other double operand.
//        double samsNewDouble = samsInt + samsDouble;
//
//        // explicit
//        // we can cast up the scale
//        // Explicit casting follows the order of conversion as shown below:
//        // Double -> Float -> Long -> Int -> Char -> Short -> Byte
//        // variable declaration = (type to cast to) oldVariable
        // short newNum = (short) (samsByte + samShort);
//
//
//        double d = 57.17;
//        int i = (int)d;  // Explicit casting from long to int data type
//        System.out.println(d);
//        System.out.println(i);  //fractional part lost
//
//        //        Challenge 1: Positive or Negative?
////        Scan user input (use Scanner) and print...
////        "n is positive" if n (the number that was scanned) is positive
////        "n is negative" if n is negative
////
////        Challenge 2: Find the largest input
////        Get 3 numbers from the user
////        Print "n is the largest", n being the largest of the 3 inputs
//
//
//
//        System.out.print("Insert a number: ");
//        int n = scanner.nextInt();
//
//        if (n > 0)
//        {
//            System.out.println("Number is positive");
//        }
//        else if (n < 0)
//        {
//            System.out.println("Number is negative");
//        }
//        else
//        {
//            System.out.println("Number is zero");
//        }
//
//        // Challenge 2: Find the largest input
//        // Get 3 numbers from the user
//        // Print "n is the largest", n being the largest of the 3 inputs
//        System.out.print("Insert the 1st number: ");
//        int number1 = scanner.nextInt();
//
//        System.out.print("Insert the 2nd number: ");
//        int number2 = scanner.nextInt();
//
//        System.out.print("Insert the 3rd number: ");
//        int number3 = scanner.nextInt();
//
//
//        if ((number1 > number2) && (number1 > number3)) {
//            System.out.println("The Largest: " + number1);
//
//        } else if ((number2 > number1) && (number2 > number3)) {
//            System.out.println("The Largest: " + number2);
//
//        } else {
//            System.out.println("The Largest: " + number3);
//        }

        // Array and ArrayList
        // how do we declare an array in Java?
        // in Java, Arrays have a predefined length

//         int [] numbers = {2, 3, 4, 5, 6, 7, 8, 9}; // if you know the size and the values

        // if we know the size, but not the values
//        int[] numbers = new int[5];
//        numbers[0] = 3;
//        numbers[1] = 8;
//        System.out.println(Arrays.toString(numbers));


        // What is an ArrayList
        // Work similar to an Array, but does not have a predefined length(it is dynamic)

//        // How do we declare an ArrayList in Java?
//        ArrayList<String> cars = new ArrayList<>();
//        cars.add("Volvo");
//        cars.add("BMW");
//        cars.add("Ford");
//        cars.add("Mazda");
//        System.out.println(cars);
//        System.out.println(cars.get(0));
//
//        ArrayList<String> names = new ArrayList<>();
//        names.add("Blanche");
//        names.add("Sam");
//        names.add("Saturn");
//        names.add("Jeredine");
//        System.out.println(names);
//
//        // get the last item in the ArrayList
//        System.out.println(names.get(names.size() - 1));
//
//        // update Sam to Samuel
//        int index = names.indexOf("Sam");
//        names.set(index, "Samuel");
//        System.out.println(names);
//
//        // Looping over an Array
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }
//
//        for (int number : numbers) {
//            System.out.println(number);
//        }

//        Challenge
//        make an Array of odd and even numbers
//        loop through this entire array
//        if the number is odd, add it into an ArrayList called oddNumbers
//        if the number is even, add it into an ArrayList called evenNumbers
//        sout both ArrayLists

//        int [] mixedNumbers = {1, 3, 5, 7, 9, 11, 2, 4, 6, 8, 10,12};
//        ArrayList<Integer> evenNumbers = new ArrayList<>();
//        ArrayList<Integer> oddNumbers = new ArrayList<>();
//
//        for (int i = 0; i < mixedNumbers.length; i++) {
//            if (mixedNumbers[i] % 2 == 0) {
//               evenNumbers.add(mixedNumbers[i]);
//            } else {
//                oddNumbers.add(mixedNumbers[i]);
//            }
//
//    }
//        System.out.println(evenNumbers);
//        System.out.println(oddNumbers);

//        I would like you to code a solution to "FizzBuzz", here are the rules:
//        For numbers between 1 and 100
//        if that number is a multiple of five, you should sout the word “fizz”
//        if the number is a multiple of three, you should say “buzz.”
//        if it is a multiple of both, you should say “fizzbuzz.”
//        if none, it should print the number
//
//            for (int i = 1; i <= 100; i++) {
//                if (i % 3 == 0 && i % 5 == 0) {
//                    System.out.println("FizzBuzz");
//                } else if (i % 5 == 0) {
//                    System.out.println("Fizz");
//                } else if (i % 3 == 0) {
//                    System.out.println("Buzz");
//                } else {
//                    System.out.println("Number is: " + i);
//                }
//
//        }


//        System.out.print("Enter Principal Amount : ");
//        double principalAmount = scanner.nextDouble();
//        System.out.print("Enter Rate of Interest : ");
//        double interestRate = scanner.nextDouble();
//        interestRate =( interestRate/100)/12;
//        System.out.print("Enter Time period in years : ");
//        int time = scanner.nextInt();
//        time = time * 12;
//        double payment= (principalAmount * interestRate) / (1 - Math.pow(1 + interestRate, -time));
//        //
//        System.out.println("Payment: " + payment);

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Principal Amount : ");
        double principalAmount = scan.nextDouble();
        System.out.print("Enter Rate of Interest : ");
        float annualInterestRate = scan.nextFloat();
        float monthlyInterestRate = annualInterestRate/100/12;
        System.out.print("Enter Time period in years : ");
        byte years = scan.nextByte();
        int numberOfPayments = years * 12;

        double payment= (principalAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));

        System.out.println("Payment: " + payment);

    }
}



