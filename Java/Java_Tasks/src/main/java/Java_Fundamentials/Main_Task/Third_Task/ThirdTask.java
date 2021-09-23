package Java_Fundamentials.Main_Task.Third_Task;

import java.util.Scanner;

public class ThirdTask {
    /*
     *Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of random items:");
        int itemsNumber = input.nextInt();
        input.close();
        int randomItem;
        for(int i=0;i<itemsNumber;i++){
            randomItem=(int) (Math.random()*10);
            if (randomItem % 2 ==0)
                System.out.print(randomItem+".");
            else
                System.out.println(randomItem+".");
        }

    }
}
