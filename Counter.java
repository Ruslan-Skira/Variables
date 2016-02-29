package NinaTasks;
import java.util.Scanner;
public class Counter {
    int firstNumber;

    public void Insert(){
        System.out.println("please enter the first number");
        Scanner scn = new Scanner(System.in);
        firstNumber = scn.nextInt();
    }
}
