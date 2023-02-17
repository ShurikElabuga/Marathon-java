package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        for (var i = 0; i < 5; i++) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите делимое");
        double num = in.nextDouble();
        System.out.println("Введите делитель");
        double del = in.nextDouble();
        if (del == 0) {
            System.out.println("Деление на 0");
             continue;
        }
         var count = num / del;
        System.out.println(count);
        }
        System.out.print("Программа завершена");
    }
}
