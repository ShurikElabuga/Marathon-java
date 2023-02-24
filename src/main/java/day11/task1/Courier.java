package day11.task1;

public class Courier implements Worker {
    private int salary;
    private boolean isPayed;
    private Warehouse count;

    public Courier(Warehouse count) {
        this.count = count;
    }

    public int getSalary() {
        return salary;
    }

    public boolean getIsPayed() {
        return isPayed;
    }
    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }
    @Override
    public void doWork() {
        salary = salary + 100;
        count.countDelivereOrder();
    }

    @Override
    public void bonus() {
        if (count.getCountDelivereOrders() >= 10000 && isPayed == false) {
            isPayed = true;
            salary = salary + 50000;
        } else if (count.getCountDelivereOrders() < 10000) {
            System.out.println("Бонус пока не доступен.");
        } else if (isPayed == true) {
            System.out.println("Бонус уже был выплачен.");
        }
    }
}
