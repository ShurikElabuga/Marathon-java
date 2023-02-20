package day8;

public class Airplane {
    private String manufacturer;
    private int year;
    private int length;
    private int weigth;
    private int fuel;

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    public Airplane(String manufacturer, int year, int length, int weigth) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weigth = weigth;
        this.fuel = 0;
    }

    public void info() {
        System.out.println("Изготовитель: " + manufacturer + ", год выпуска: " + year + ", длина: " + length + ", вес: " + weigth + ", количество топлива в баке: " + fuel);

    }
    public String toString() {
        return "Изготовитель: " + manufacturer + ", год выпуска: " + year + ", длина: " + length + ", вес: " + weigth + ", количество топлива в баке: " + fuel;
    }

    public void fillUp(int n) {
        fuel = fuel + n;
    }
}
