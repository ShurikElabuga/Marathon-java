package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane plane1 = new Airplane("Ильюшин", 1990, 50, 95);
        plane1.setYear(1980);
        plane1.setLength(35);

        plane1.fillUp(10000);
        plane1.fillUp(23000);

        plane1.info();
    }
}

