package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file1 = new File("C:/My downloads/JavaMarathon2021/src/main/resources/shoes.csv");
        File file2 = new File("C:/My downloads/JavaMarathon2021/src/main/resources/missing_shoes.txt");
        file1.getParentFile().mkdirs();
        file2.getParentFile().mkdirs();
        try {
            PrintWriter pw = new PrintWriter(file2);
            Scanner scanner = new Scanner(file1);
            while (scanner.hasNextLine()) {
                String input = scanner.nextLine();
                String[] shoes = input.split(";");
                if (shoes.length < 3) {
                    throw new IllegalArgumentException();
                } else if (Integer.parseInt(shoes[2]) == 0) {
                    pw.println(shoes[0] + ", " + shoes[1] + ", " + shoes[2]);
                }
            }
            pw.close();
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файла нет");
        } catch (IllegalArgumentException e) {
            System.out.println("Не корректное содержание файла");
        }

    }
}
