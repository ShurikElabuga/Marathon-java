package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
     int[] numbers = new int[100];
     Random rand = new Random();
     for (var i = 0; i < numbers.length; i++) {
         numbers[i] = rand.nextInt(10000);
     }
     var sum =0;
     var max = numbers[0] + numbers[1] + numbers[2];
     var result = 0;
     for (var j = 1; j < numbers.length - 2; j++) {
         sum = numbers[j] + numbers[j + 1] + numbers[j + 2];
         if (sum > max) {
             max = sum;
             result = j;
         }
     }
     System.out.println(max);
     System.out.println(result);
    }
}
