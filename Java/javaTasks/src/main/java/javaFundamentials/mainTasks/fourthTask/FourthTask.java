package javaFundamentials.mainTasks.fourthTask;

import java.util.Scanner;

public class FourthTask {
    /*
     *Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение)
     *и вывести результат на консоль.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of items you want to enter:");
        int itemNumber = input.nextInt();
        int sum = 0;
        int multiplication = 1;
        int temp; //temporary variable to read input
        for(int i = 0; i < itemNumber; i++){
            System.out.print("Enter " + (i + 1) + " item:");
            temp = input.nextInt();
            sum += temp;
            multiplication *= temp;
        }
        System.out.println("Sum=" + sum);
        System.out.println("Multiplication=" + multiplication);
    }
}
