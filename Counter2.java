package NinaTasks;//1. Составьте программу, котораЯ вычисляет сумму чисел от 1 до n.значение n вводится с клавиатуры.

public class Counter2 {
    public static void main (String [] args){

        Counter c = new Counter();
        c.Insert();

       int sum = 0;
        for (int i = 1; i <=c.firstNumber; i++ ){
            System.out.println(i);
            sum = sum + i;
        }
        System.out.println("Sum " + sum);
    }

}
