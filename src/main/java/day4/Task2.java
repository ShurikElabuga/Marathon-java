package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
     int[] numbers = new int[100];
     Random rand = new Random();
     for (var i = 0; i < numbers.length; i++) {
         numbers[i] = rand.nextInt(10000);
     }
     var max = numbers[0];
     var min = numbers[0];
     var sum = 0;
     var sum0 = 0;
     for (int num : numbers) {
         if (num > max) {
             max = num;
         } else if (num < min) {
             min = num;
         } else if (num % 10 == 0) {
             sum0 = sum0 + 1;
             sum = sum + num;
         }
     }
     System.out.println("Наибольший элемент массива: " + max);
     System.out.println("Наименьший элемент массива: " + min);
     System.out.println("Количество элементов массива, оканчивающихся на 0: " + sum0);
     System.out.println("Сумма элементов массива, оканчивающихся на 0: " + sum);
    }
}
