package Test2;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите любое имя:");
        while(true){

            if(in.nextLine().equals("Вячеслав"))
                System.out.println("Привет, Вячеслав");
            else
                System.out.println("Нет такого имени");
        }

    }
}
