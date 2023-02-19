package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("Красный");
        car.setModel("BMW");
        car.setYear(2020);

        Motorbike bike = new Motorbike("Honda", "Белый", 2021);
        car.info();
        bike.info();
        System.out.println(car.yearDifference(1900));
        System.out.println(bike.yearDifference(2000));

    }
}
