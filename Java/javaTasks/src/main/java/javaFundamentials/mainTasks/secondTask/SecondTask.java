package javaFundamentials.mainTasks.secondTask;

import java.util.Scanner;

public class SecondTask {
    /*
     *Отобразить в окне консоли аргументы командной строки в обратном порядке.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter arguments:");
        String arguments = input.nextLine();
        input.close();
        System.out.println(new StringBuilder(arguments).reverse());
    }
}
