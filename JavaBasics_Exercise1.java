import java.util.Scanner;

public class JavaBasics_Exercise1 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        // 1.Develop a program that takes the weight (in kilograms) and height (in meters)
        //as input and calculates the BMI, then prints it.
        System.out.println("Please enter your weight(kg) : ");
        double weight = input.nextDouble();
        System.out.println("please enter your height(m) : ");
        double height = input.nextDouble();
        System.out.println("BMI = " + weight / Math.pow(height, 2));
//
        System.out.println("****************************************");
//        //2.Write a program that takes the obtained marks and total marks as input and
//        //calculates the percentage, then prints it.
        System.out.println("please enter your obtained marks: ");
        double obtainedMark = input.nextDouble();
        System.out.println("please enter your total marks: ");
        double totalMark = input.nextDouble();
        double markPercentage = (obtainedMark/totalMark)*100;
        System.out.println("Percentage = " + markPercentage + "%");
//
        System.out.println("****************************************");
//        //3.Create a program that takes an amount in one currency and an exchange rate
//        //as input, then converts and prints the amount in another currency.
        System.out.println("Please, enter the amount (USD): ");
        double amountUSD = input.nextDouble();
        System.out.println("Please, enter exchange rate (USD to EUR): ");
        double exchangeRate = input.nextDouble();
        double amountInEUR = (amountUSD*exchangeRate)/100;
        System.out.println("Amount in EUR = " + amountUSD*exchangeRate);
        input.nextLine();
//
        System.out.println("****************************************");
//        //4.Create a program that takes a string as input, calculates its length, and then reverses
//        //the string using the StringBuilder class, finally printing both the length and reversed string.
        System.out.println("Please, Enter any string: ");
        String userStringInput = input.nextLine();
        StringBuilder sbString = new StringBuilder(userStringInput);
        sbString.reverse();
        String reversedString = sbString.toString();
        System.out.println("Length of the string: " + userStringInput.length()  + " And Reversed string: " + reversedString);

        System.out.println("****************************************");
        //5.Develop a program that takes a sentence as input and extracts a substring from
        //it, then prints the extracted substring.
         System.out.println("Please, Enter a sentence: ");
         String aSentenceInput = input.nextLine();
         //String sentence = "The quick brown fox jumps over the lazy dog";
         System.out.println(aSentenceInput.substring(10,19));

        System.out.println("****************************************");
        //6.Write a program that takes a sentence and a keyword as input, then check if
        //the keyword is present in the sentence and prints the result.
        System.out.println("Please, Enter a sentence: ");
        String userSentence = input.nextLine();
        System.out.println("And enter a keyword: ");
        String userKeyword = input.nextLine();
        boolean isPresent = userSentence.contains(userKeyword);
        if(isPresent)
            System.out.println("Keyword " + userKeyword + " is present in the sentence ");

        System.out.println("****************************************");
        //7.Develop a program that takes a sentence and a word to replace as input, then
        //replace all occurrences of the word with another word and prints the modified sentence.
        System.out.println("Please, Enter a sentence: ");
        String theSentenceInput = input.nextLine();
        System.out.println("And enter a word to replace: ");
        String wordToReplace = input.next();
        System.out.print("And enter replacement word: ");
        String replacementWord = input.next();
        System.out.println(theSentenceInput.replaceAll(wordToReplace, replacementWord));

        System.out.println("****************************************");
        //8.Write a program that takes two strings as input and check if they are equal,
        //ignoring the case, then prints whether they are equal or not.
        System.out.println("Enter the first string: ");
        String userString1 = input.next();
        System.out.println("Enter the second string: ");
        String userString2 = input.next();
        if(userString2.equalsIgnoreCase(userString2))
            System.out.println("Strings are equal");
    }
}
