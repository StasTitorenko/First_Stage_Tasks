package Java_Fundamentials.Optional_Task.Third_Task;

import java.util.Scanner;

public class ThirdTask {
    /*
     *Ввести n чисел с консоли.
     *Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of items you want to enter: ");
        int itemNumber = input.nextInt();
        String[] itemArray = new String[itemNumber];
        int allLength=0;
        for (int i=0;i<itemNumber;i++) {
            System.out.print("Enter "+(i+1)+" item:");
            itemArray[i]=input.next();
            allLength+=itemArray[i].length();
        }
        input.close();
        int mediumLength = allLength/itemNumber;
        System.out.println("Medium length="+mediumLength);
        for (int i=0;i<itemNumber;i++){
            if (itemArray[i].length()>mediumLength)
                System.out.println("Number "+itemArray[i]+" more than medium length, it length="+itemArray[i].length());
        }
    }
}
