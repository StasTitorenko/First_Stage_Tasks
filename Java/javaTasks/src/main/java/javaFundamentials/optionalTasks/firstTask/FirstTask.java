package javaFundamentials.optionalTasks.firstTask;

import java.util.Scanner;

public class FirstTask {
    /*
     *Ввести n чисел с консоли.
     *Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of items you want to enter: ");
        int itemNumber = input.nextInt();
        int [] itemArray = new int [itemNumber];
        int shortestNumber = 0;
        int longestNumber = 0 ;
        int shortestNumberLength = 2147483647;
        int longestNumberLength = 0;
        for (int i = 0; i < itemNumber; i++) {
            System.out.print("Enter " + (i + 1) + " item:");
            itemArray[i] = input.nextInt();
            if (String.valueOf(itemArray[i]).length() >= longestNumberLength) {
                longestNumber = itemArray[i];
                longestNumberLength = String.valueOf(itemArray[i]).length();
            }
            else if (String.valueOf(itemArray[i]).length() < shortestNumberLength) {
                shortestNumber = itemArray[i];
                shortestNumberLength = String.valueOf(itemArray[i]).length();
            }
        }
        if (shortestNumberLength == 2147483647){ //Check no one else if
            shortestNumber = itemArray[0];
            shortestNumberLength = String.valueOf(itemArray[0]).length();
        }
        System.out.println("Shortest number=" + shortestNumber +" it's length=" + shortestNumberLength);
        System.out.println("Longest number=" + longestNumber +" it's length=" + longestNumberLength);
    }
}
