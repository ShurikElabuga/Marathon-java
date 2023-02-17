package day4;

import java.util.Random;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int num = in.nextInt();
        int[] nums = new int[num];
        Random rand = new Random();
        for (var i = 0; i < nums.length; i++) {
            nums[i] = rand.nextInt((10) + 1);
        }
        for (int x : nums) {
            System.out.print(x + ", ");
        }
        var sum = 0;
        var sum8 = 0;
        var sum1 = 0;
        var sumchet = 0;
        var sumnechet = 0;
        for (var j = 0; j < nums.length; j++) {
            sum = sum + nums[j];
            if (nums[j] > 8) {
                sum8 = sum8 + 1;
            } else if (nums[j] == 1) {
                sum1 = sum1 + 1;
            } else if (nums[j] % 2 == 0) {
                sumchet = sumchet + 1;
            } else if (nums[j] % 2 != 0) {
                sumnechet = sumnechet + 1;
            }
        }
        System.out.println();
        System.out.println("Длина массива: " + num);
        System.out.println("Количество чисел больше 8: " + sum8);
        System.out.println("Количество чисел равных 1: " + sum1);
        System.out.println("Количество четных чисел: " + sumchet);
        System.out.println("Количество нечетных чисел: " + sumnechet);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
