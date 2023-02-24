package day11.task1;

public class Task1 {
    public static void main(String[] args) {
      Warehouse warehouse1 = new Warehouse();
      Picker picker1 = new Picker(warehouse1);
      Courier courier1 = new Courier(warehouse1);

      businessProcess(picker1);

      System.out.println(picker1);
      System.out.println(warehouse1);

        businessProcess(courier1);

        System.out.println(courier1);
        System.out.println(warehouse1);


    }
     public static void businessProcess(Worker worker) {
        for (var i = 0; i <10000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }
}
