package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("People.txt");
        System.out.println(parseFileToObjList(file));

    }
    public static List<Person> parseFileToObjList(File file) {
        List<Person> people = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String input = scanner.nextLine();
                String[] members = input.split(" ");
                if (Integer.parseInt(members[1]) < 0) {
                    throw new IllegalArgumentException();
                }
                Person person = new Person(members[0], Integer.parseInt(members[1]));

                people.add(person);
            }
            return people;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
        } catch(IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
        return null;
    }
}
