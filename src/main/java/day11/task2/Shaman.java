package day11.task2;

public class Shaman extends Hero implements Healer, MagicAttack {

    int magicAtt = 15;
    static final int HEALTH_AMOUNT = 50;
    static final int HEALTH_TEAMMATE = 30;

    public Shaman() {
        physAtt = 10;
        physDef = 0.2;
        magicDef = 0.2;
    }

    @Override
    public void magicAttac(Hero hero) {
        double attack = magicAtt * (1 - hero.magicDef);
        if ((hero.health - attack) < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        } else {
            hero.health -= attack;
        }
    }

        @Override
        public void healHimself () {
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
        return "Shaman{" +
                "health=" + health +
                '}';
    }
}
