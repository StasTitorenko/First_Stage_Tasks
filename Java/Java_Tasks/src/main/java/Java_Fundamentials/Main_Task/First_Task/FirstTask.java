package Java_Fundamentials.Main_Task.First_Task;

import java.util.Scanner;

public class FirstTask {
    /*
     * Приветствовать любого пользователя при вводе его имени через командную строку.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your name pls:");
        String personName = input.nextLine();
        System.out.println(personName+" You are welcome!!!");
        input.close();
    }
}
