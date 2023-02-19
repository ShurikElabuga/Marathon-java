package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String course;

    public Teacher(String name, String course) {
        this.name = name;
        this.course = course;
    }

    String eval = "";
    Random rand = new Random();

    public void evaluate(Student student) {
        int x = rand.nextInt(4) + 2;
        if (x == 2) {
            eval = "НЕУДОВЛЕТВОРИТЕЛЬНО";
        } else if (x == 3) {
            eval = "УДОВЛЕТВОРИТЕЛЬНО";
        } else if (x == 4) {
            eval = "ХОРОШО";
        } else
            eval = "ОТЛИЧНО";
        System.out.println("Преподаватель " + name + " оценил студента " + student.getName() + " по предмету " + course + " на оценку " + eval);

    }
}
