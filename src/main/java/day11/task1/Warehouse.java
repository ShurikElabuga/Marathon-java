package day11.task1;

public class Warehouse {
    private int countPickedOrders;
    private int countDelivereOrders;


    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDelivereOrders() {
        return countDelivereOrders;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "countPickedOrders=" + countPickedOrders +
                ", countDelivereOrders=" + countDelivereOrders +
                '}';
    }
    public void countPickedOrder() {
        countPickedOrders++;
    }
    public void countDelivereOrder() {
        countDelivereOrders++;
    }
}
