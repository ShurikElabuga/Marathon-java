package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Введите диапазон чисел");
    int a = in.nextInt();
    int b = in.nextInt();
    if (a >= b) {
        System.out.print("Некорректный ввод");
    }
    for(var i = a + 1; i < b; i++) {
        if (i % 5 == 0 && i % 10 != 0) {
           System.out.print(i + " ");
        }
    }

    }
}
