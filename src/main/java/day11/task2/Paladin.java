package day11.task2;

public class Paladin extends Hero implements Healer {

    static final int HEALTH_AMOUNT = 25;
    static final int HEALTH_TEAMMATE = 10;
    public Paladin() {
        physDef = 0.5;
        magicDef = 0.2;
        physAtt = 15;
    }

    @Override
    public void healHimself() {
        if (health + HEALTH_AMOUNT > MAX_HEALTH) {
            health = MAX_HEALTH;
        } else {
            health += HEALTH_AMOUNT;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
     if (hero.health + HEALTH_TEAMMATE > 100) {
         hero.health = 100;
     } else {
         hero.health += HEALTH_TEAMMATE;
     }
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
    }
}
