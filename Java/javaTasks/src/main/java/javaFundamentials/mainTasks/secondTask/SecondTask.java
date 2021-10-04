package javaFundamentials.mainTasks.secondTask;

import java.util.Scanner;

public class SecondTask {
    /*
     *Отобразить в окне консоли аргументы командной строки в обратном порядке.
     */
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(System.in);
            System.out.print("Enter whole number:");
            int arguments = input.nextInt();
            input.close();
            System.out.println(new StringBuilder(String.valueOf(arguments)).reverse());
        }
        catch (Exception e) {
            System.out.println("It's not a  whole number");
        }
    }
}

