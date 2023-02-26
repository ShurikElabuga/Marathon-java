package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        fullList(0, 30, list);
        System.out.println(list);

        fullList(300, 350, list);
        System.out.println(list);

    }
    public static void fullList(int start, int end, List<Integer> list) {
        for (var i = start; i <= end; i = i + 2) {
            list.add(i);
        }
    }
}
