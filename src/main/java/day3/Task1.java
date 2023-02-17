package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     System.out.println("Введите город");
     String city = in.nextLine();
     String city1 = city.toUpperCase();
        switch(city1) {
         case "STOP":
             System.out.println("Программа завершила работу");
                 break;
         case "МОСКВА":
         case "ВЛАДИВОСТОК":
         case "РОСТОВ":
             System.out.println("Россия");
                 break;
         case "РИМ":
         case "МИЛАН":
         case "ТУРИН":
             System.out.println("Италия");
                 break;
         case "ЛИВЕРПУЛЬ":
         case "МАНЧЕСТЕР":
         case "ЛОНДОН":
             System.out.println("Великобритания");
                 break;
         case "БЕРЛИН" :
         case "МЮНХЕН" :
         case "КЁЛЬН" :
             System.out.println("Германия");
         default:
             System.out.println("Неизвестная страна");
         }
    }
}
