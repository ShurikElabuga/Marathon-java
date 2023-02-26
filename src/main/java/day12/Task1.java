package day12;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("BMW");
        arrayList.add("AUDI");
        arrayList.add("KIA");
        arrayList.add("VOLVO");
        arrayList.add("OPEL");

        System.out.println(arrayList);

        arrayList.add(2, "FORD");
        arrayList.remove(0);

        System.out.println(arrayList);



    }
}
