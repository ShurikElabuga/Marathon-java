package day11.task1;

public class Picker implements Worker {
    private int salary;
    private boolean isPayed;
    private Warehouse count;

    public Picker(Warehouse count) {
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
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

    @Override
    public void doWork() {
     salary = salary + 80;
     count.countPickedOrder();
    }

    @Override
    public void bonus() {
        if (count.getCountPickedOrders() >= 10000 && isPayed == false) {
            isPayed = true;
            salary = salary + 70000;
        } else if (count.getCountPickedOrders() < 10000) {
            System.out.println("Бонус пока не доступен.");
        } else if (isPayed == true) {
            System.out.println("Бонус уже был выплачен.");
        }
    }
}
