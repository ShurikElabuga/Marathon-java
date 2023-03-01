package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {

        File file = new File("People.txt");
        System.out.println(parseFileToStringList(file));
    }
    public static List<String> parseFileToStringList(File file) {
        List<String> people = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()) {
                String input = scanner.nextLine();
                String[] members = input.split(" ");
                if (Integer.parseInt(members[1]) < 0) {
                    throw new IllegalArgumentException();
                }
                people.add(input);
            }
            return people;

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный файл");
        }
        return null;
    }
}
