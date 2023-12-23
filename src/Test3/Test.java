package Test3;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.print("Введите элементы массива через пробел: ");
        Scanner scanner = new Scanner(System.in);
        String massiveStr[];
        if(scanner.hasNextLine()) {
            massiveStr = scanner.nextLine().split("[,\\s]+");
            System.out.print("Элементы массива, кратные 3: ");
            for(String i : massiveStr){
                try {
                    if (Integer.parseInt(i) % 3 == 0) {
                        System.out.print(i + " ");
                    }
                } catch (NumberFormatException ex) {
                    System.err.println(i + " - неверный элемент массива!");
                }
            }
        }



    }
}
