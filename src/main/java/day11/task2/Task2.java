package day11.task2;

public class Task2 {
    public static void main(String[] args) {

        Warrior warrior = new Warrior();
        Paladin paladin = new Paladin();
        Magician magician = new Magician();
        Shaman shaman = new Shaman();

        warrior.physicAttac(paladin);
        System.out.println(paladin);

        paladin.physicAttac(magician);
        System.out.println(magician);

        shaman.healTeammate(magician);
        System.out.println(magician);

        magician.magicAttac(paladin);
        System.out.println(paladin);

        shaman.physicAttac(warrior);
        System.out.println(warrior);

        paladin.healHimself();
        System.out.println(paladin);

        for (var i = 0; i < 5; i++) {
            warrior.physicAttac(magician);
            System.out.println(magician);
        }
    }
}
