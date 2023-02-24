package day11.task2;

public abstract class Hero implements PhysAttack {
     int health;
     double physDef;
     double magicDef;
     int physAtt;
     static final int MAX_HEALTH = 100;
     static final int MIN_HEALTH = 0;

    public Hero() {
        health = MAX_HEALTH;

    }

    @Override
    public void physicAttac(Hero hero) {
        double attack = physAtt * (1 - hero.physDef);
        if ((hero.health - attack) < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        } else {
            hero.health -= attack;
        }
    }
}
