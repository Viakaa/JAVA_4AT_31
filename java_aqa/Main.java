package Task1;

//V 3: Loop Statements
//Objective: To understand and use loop statements in Java with primitive types.
//Instructions:
//Use a for loop to print the first 10 positive integers to the console.
//Use a while loop to print the first 10 positive integers to the console.

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            System.out.println(i);
        }
        System.out.println("\ntask 2");

        int i = 0;
        while (i < 11) {
            System.out.println(i);
            i++;
        }
    }
}
