package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("TextNumbers.txt");
        printResult(file);

    }
    public static void printResult (File file) {
        try {
            Scanner scanner = new Scanner(file);
            String[] line = scanner.nextLine().split(" ");
            int[] numbers = new int[line.length];
            var sum = 0;

            for (var i = 0; i < line.length; i++) {
                numbers[i] = Integer.parseInt(line[i]);
                if (numbers[i] < 0) {
                    throw new IllegalArgumentException();
                }
                sum = sum + numbers[i];
            }
            double averege = (double)sum / numbers.length;
            System.out.print(averege + " --> ");
            System.out.printf("%.3f", averege);
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Файл содержит отрицательные числа");
        }

    }
}

