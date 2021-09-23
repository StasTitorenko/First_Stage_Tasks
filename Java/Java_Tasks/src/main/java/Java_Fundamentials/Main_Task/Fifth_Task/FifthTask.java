package Java_Fundamentials.Main_Task.Fifth_Task;

import java.util.Scanner;

public class FifthTask {
    /*
     *Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу.
     *Осуществить проверку корректности ввода чисел.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of month:");
        int monthNumber = input.nextInt();
        if (monthNumber>0 && monthNumber<13) {
            switch (monthNumber) {
                case 1:
                    System.out.println("January");
                    break;
                case 2:
                    System.out.println("February");
                    break;
                case 3:
                    System.out.println("March");
                    break;
                case 4:
                    System.out.println("April");
                    break;
                case 5:
                    System.out.println("May");
                    break;
                case 6:
                    System.out.println("June");
                    break;
                case 7:
                    System.out.println("July");
                    break;
                case 8:
                    System.out.println("August");
                    break;
                case 9:
                    System.out.println("September");
                    break;
                case 10:
                    System.out.println("October");
                    break;
                case 11:
                    System.out.println("November");
                    break;
                case 12:
                    System.out.println("December");
                    break;
            }
        }
        else
            System.out.println("Wrong number");


    }
}
