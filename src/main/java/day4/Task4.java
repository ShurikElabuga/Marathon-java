package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
     int[] numbers = new int[100];
     Random rand = new Random();
     for (var i = 0; i < numbers.length; i++) {
         numbers[i] = rand.nextInt(10000);
     }
     var max = 0;
     var result = 0;
     for (var j = 0; j < numbers.length - 2; j++) {
         var sum = 0;
         for (var l = j; l < j + 3; l++) {
             sum = sum + numbers[l];
            }
             if (sum > max) {
                 max = sum;
                 result = j;
         }

     }
     System.out.println(max);
     System.out.println(result);
    }
}
