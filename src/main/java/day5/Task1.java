package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModel("ВАЗ - 2101");
        car1.setColor("Синий");
        car1.setYear(1982);
        System.out.println("Модель автомобиля: " + car1.getModel());
        System.out.println("Цвет автомобиля: " + car1.getColor());
        System.out.println("Года выпуска: " + car1.getYear());
    }
}
