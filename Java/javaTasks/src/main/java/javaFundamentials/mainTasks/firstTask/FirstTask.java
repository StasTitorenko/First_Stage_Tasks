package javaFundamentials.mainTasks.firstTask;

import java.util.Scanner;

public class FirstTask {
    /*
     * Приветствовать любого пользователя при вводе его имени через командную строку.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your name pls:");
        String personName = input.nextLine();
        System.out.println(personName.replaceAll("[^A-z]+", "") + " You are welcome!!!");
        input.close();
    }
}
