package day6;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
     Teacher teacher = new Teacher("МарьИванна", "история");
     Student student = new Student("Иванов Петр Иванович");
     teacher.evaluate(student);
    }
}

