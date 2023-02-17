package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    System.out.print("Укажите количество этажей дома: ");
    int num = in.nextInt();
    if (num <= 0) {
        System.out.print("Ошибка ввода");
    }
    if (num >= 1 && num < 5) {
        System.out.print("Малоэтажный дом");
    } else if (num >= 5 && num < 9) {
        System.out.print("Среднеэтажный дом");
    } else {
        System.out.print("Многоэтажный дом");
    }
    }
}
