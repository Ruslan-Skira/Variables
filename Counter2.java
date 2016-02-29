package NinaTasks;//1. Составьте программу, котораЯ вычисляет сумму чисел от 1 до n.значение n вводится с клавиатуры.

import java.util.Scanner;

public class Counter2 {

    public static void main (String [] args){


        int firstNumber;
        int sum = 0;

        System.out.println("please enter the first number");
        Scanner scn = new Scanner(System.in);
        firstNumber = scn.nextInt();

        for (int i = 1; i <= firstNumber; i++ ){
            System.out.println(i);
            sum = sum + i;
        }
        System.out.println("Sum " + sum);
    }

}
