package day19;

import com.sun.glass.ui.Clipboard;
import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


/**
 * @author Neil Alishev
 */
public class Task1 {
    public static void main(String[] args) {
        File file = new File("C://My downloads//JavaMarathon2021//src//main//resources//dushi.txt");
        try {
            //Set<String> hashSet = new HashSet<>();
            //ArrayList<String> list = new ArrayList<>();
            Map<String, Integer> hashMap = new HashMap<>();
            Scanner scanner = new Scanner(file);
            scanner.useDelimiter("[.,:;()?!\"\\s-]+");
            var counter = 0;
            while (scanner.hasNext()) {
                String line = scanner.next();
                String[] words = line.split(" ");
                for (String word : words) {
                    //list.add(word);
                    //hashSet.add(word);
                    if (hashMap.containsKey(word)) {
                        counter = hashMap.get(word) + 1;
                    } else {
                        counter = 1;
                    }
                    hashMap.put(word, counter);
                }
            }
            scanner.close();
            //Map<String, Integer> hashMap = new HashMap<>();
            /*for (String wordSet : hashSet) {
                int count = 0;
                for (String word : list) {
                    if (wordSet.equals(word)) {
                        count++;
                    }
                }
                hashMap.put(wordSet, count);
            }*/
            List<Map.Entry<String, Integer>> mapList = new ArrayList<>();
            for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
                mapList.add(entry);
            }
            Collections.sort(mapList, new Comparator<Map.Entry<String, Integer>>() {
                @Override
                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                    if (o1.getValue() > o2.getValue()) {
                        return -1;
                    } else if (o1.getValue() < o2.getValue()) {
                        return 1;
                    } else {
                        return 0;
                    }
                }
            });
            for (int i = 0; i < 100; i++) {
                System.out.println(mapList.get(i).getKey());
            } // "Чичиков" - 601
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}





