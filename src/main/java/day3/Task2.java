package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ВВедите делимое");
        double num = in.nextDouble();
        System.out.println("ВВедите делитель");
        double del = in.nextDouble();
        while (del != 0) {
            var count = num / del;
            System.out.println(count);
            break;
        }
        System.out.print("Программа завершила работу");
    }
}
