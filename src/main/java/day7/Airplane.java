package day7;

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
    public void fillUp(int n) {
        fuel = fuel + n;
    }
    public static void compareAirplanes(Airplane plane1, Airplane plane2) {
        int dif = plane1.length - plane2.length;
        if (dif < 0) {
            System.out.println("Самолет " + plane2.manufacturer +" длиннее чем " + plane1.manufacturer);
        }else if (dif > 0) {
            System.out.println("Самолет " + plane1.manufacturer +" длиннее чем " + plane2.manufacturer);
        }else {
            System.out.println("Длинна самолетов одинакова");
        }
    }
}
