package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike bike1 = new Motorbike("Урал", "Черный", 1985);
        System.out.println("Модель: " + bike1.getModel());
        System.out.println("Цвет: " + bike1.getColor());
        System.out.println("Год выпуска: " + bike1.getYear());
    }
}
class Motorbike {
    private String color;
    private String model;
    private int year;
    public Motorbike(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }
    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
    public int getYear() {
        return year;
    }
}
