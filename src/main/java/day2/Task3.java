package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите диапазон чисел");
        int a = in.nextInt();
        int b = in.nextInt();
        if (a >= b) {
            System.out.print("Некорректный ввод");
        }
        var i = a + 1;
        while (i < b) {
            if (i % 5 == 0 && i % 10 != 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
