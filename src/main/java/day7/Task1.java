package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane plane1 = new Airplane("Boeing", 2005, 70, 200);
        Airplane plane2 = new Airplane("Airbus", 2010, 50, 150);

        Airplane.compareAirplanes(plane1, plane2);
    }
}