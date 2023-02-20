package day8;

public class Task1 {
    public static void main(String[] args) {
     String str = "";
     long startTime = System.currentTimeMillis();
     for (var i = 0; i < 20001; i++) {
         str = str + i +", ";
     }
     long stopTime = System.currentTimeMillis();
     System.out.println("Длительность работы, в мс.: " + (stopTime - startTime));
     System.out.println(str);


     StringBuilder sb = new StringBuilder();
     long startTime2 = System.currentTimeMillis();
     for (var j = 0; j < 20001; j++) {
         sb.append(j + ", ");
     }
        long stopTime2 = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.: " + (stopTime2 - startTime2));
        System.out.println(sb);
    }
}
