package testassng;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Dupword {

    public static void main(String[] args) {

    	System.out.println("Enter the words needed");
    	Scanner sc=new Scanner(System.in);
    	String input=sc.next();

        String[] words = input.split("\\s+");

        StringBuilder output = new StringBuilder();

        // Build the output string with no duplicates

        for (String word : words) {

            if (!output.toString().contains(word)) {

                output.append(word).append(" ");

            }

        }

        System.out.println("Input String: " + input);

        System.out.println("Output String: " + output.toString().trim());

    }

}