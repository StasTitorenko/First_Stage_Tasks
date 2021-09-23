package Java_Fundamentials.Optional_Task.First_Task;

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
        String[] itemArray = new String[itemNumber];
        String shortestNumber="";
        String longestNumber="";
        int shortestNumberLength=2147483647;
        int longestNumberLength=0;
        for (int i=0;i<itemNumber;i++) {
            System.out.print("Enter "+(i+1)+" item:");
            itemArray[i]=input.next();
            if (itemArray[i].length()>=longestNumberLength) {
                longestNumber=itemArray[i];
                longestNumberLength=itemArray[i].length();
            }
            else if (itemArray[i].length()<shortestNumberLength) {
                shortestNumber=itemArray[i];
                shortestNumberLength=itemArray[i].length();
            }
        }
        if (shortestNumberLength==2147483647){ //Check no one else if
            shortestNumber=itemArray[0];
            shortestNumberLength=itemArray[0].length();
        }
        System.out.println("Shortest number="+shortestNumber+" it's length="+shortestNumberLength);
        System.out.println("Longest number="+longestNumber+" it's length="+longestNumberLength);
    }
}
