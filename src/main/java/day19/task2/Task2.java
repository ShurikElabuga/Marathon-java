package day19.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Neil Alishev
 */
public class Task2 {
    public static void main(String[] args) {
        File file = new File("C:/My downloads/JavaMarathon2021/src/main/resources/taxi_cars.txt");
        Map<Integer, Point> carsPlace = new HashMap<>();

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] numbersString = line.split(" ");
                int[] numbers = new int[3];
                int counter = 0;
                for (String number : numbersString) {
                    numbers[counter++] = Integer.parseInt(number);
                }

                Point point = new Point(numbers[1], numbers[2]);
                carsPlace.put(numbers[0], point);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        Scanner in = new Scanner(System.in);
        System.out.println("Введите координаты Х и У двух точек квадрата в диапазоне от 0 до 99.\n" +
                " Значения координат первой точки должны быть меньше значений координат второй точки.\n");
        System.out.println("Введите координату Х первой точки квадрата");
        int x1 = in.nextInt();
        System.out.println("Введите координату У первой точки квадрата");
        int y1 = in.nextInt();
        System.out.println("Введите координату Х второй точки квадрата");
        int x2 = in.nextInt();
        System.out.println("Введите координату У второй точки квадрата");
        int y2 = in.nextInt();
        if (x2 < x1 || y2 < y1 || x1 < 0 || x1 > 99 || x2 < 0 || x2 > 99 || y1 < 0 || y1 > 99 || y2 < 0 || y2 > 99) {
            System.out.println("Введены неправильные значения.");
            return;
        }
        in.close();
        System.out.println("Машины, расположенные в пределах заданного квадрата: ");
        int counter = 0;
        for (Map.Entry<Integer, Point> entry : carsPlace.entrySet()) {
            if (entry.getValue().getX() > x1 && entry.getValue().getX() < x2 && entry.getValue().getY() > y1 && entry.getValue().getY() < y2) {
                counter++;
                System.out.println(entry.getKey());
            }
        }
        System.out.println("Всего " + counter + " машин.");
    }
}

