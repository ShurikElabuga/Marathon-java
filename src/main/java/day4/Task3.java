package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
    int[][] numbers = new int[12][8];
    Random rand = new Random();
    for (var i = 0; i < numbers.length; i++) {
        for (var j = 0; j < numbers[i].length; j++) {
            numbers[i][j] = rand.nextInt(51);
            System.out.print(numbers[i][j] + " ");
        }
        System.out.println();
    }
    var sum = 0;
    var result = 0;
    int[] summers = new int[12];
    for (var i = 0; i < 12; i++) {
        for (var j = 0; j < 8; j++) {
            summers[i] = summers[i] + numbers[i][j];
        }
        System.out.print(summers[i] + ", ");
    }
    var max = summers[0];
    for (var x = 1; x < 12; x++) {
        if (summers[x] > max) {
            max = summers[x];
            result = x;
        }
    }
      System.out.println();
      System.out.println(result);
    }
}
