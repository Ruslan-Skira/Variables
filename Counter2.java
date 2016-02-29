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
            sum = sum + i;
        }

        System.out.println("Sum " + sum);
        //    2. Определить, является ли число простым (делится только на 1 и на себя)
        int num = sum;
        int temp;
        boolean unswer=true;
        for (int i = 2; i <=num/2; i++) {
            temp = num % i;
            if (temp==0) {
                unswer = false;
                break;
            }
        }
        if (unswer){
            System.out.println(num + " prime number");
        } else {
            System.out.println(num + " composite number");
        }
    }

}
