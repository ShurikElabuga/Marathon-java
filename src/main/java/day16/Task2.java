package day16;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {

        File file1 = new File("C://My downloads//JavaMarathon2021//src//main//resources//file1.txt");
        PrintWriter pw1 = new PrintWriter(file1);

            Random rand = new Random();
            for (var i = 0; i < 1000; i++) {
                pw1.print(rand.nextInt(100) + " ");
            }
            pw1.close();

            File file2 = new File("C://My downloads//JavaMarathon2021//src//main//resources//file2.txt");
            PrintWriter pw2 = new PrintWriter(file2);
            Scanner scan = new Scanner(file1);
            String line = scan.nextLine();
            String[] numbersString = line.split(" ");
            int[] numbers = new int[1000];
            int counter1 = 0;
            for (String number : numbersString) {
                numbers[counter1++] = Integer.parseInt(number);
            }
            scan.close();
            int counter2 = 0;
            var sum = 0;
            for (int number : numbers) {
                sum = sum + number;
                counter2++;
                if (counter2 == 20) {
                    pw2.print((sum / 20.0) + " ");
                    counter2 = 0;
                    sum = 0;
                }
            }
            pw2.close();
            printResult(file2);
    }
    static void printResult(File file) throws FileNotFoundException {
        Scanner scan = new Scanner(file);
       String line = scan.nextLine();
        String[] numberString = line.split(" ");
        double sum = 0;
        for (String number : numberString) {
            sum += Double.parseDouble(number);
        }
        scan.close();
        System.out.println((int)sum);
    }
}
