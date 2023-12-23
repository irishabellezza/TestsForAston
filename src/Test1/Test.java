package Test1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        while (true)
        {
            System.out.println("Введите любое число:");
            n = in.nextInt();
            if(n > 7) {
                System.out.println("Привет");
            }

        }


    }
}
