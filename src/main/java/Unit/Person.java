package Unit;

import org.jetbrains.annotations.NotNull;

import java.util.Collections;

public abstract class Person implements GameInterface {
    protected int attack;
    protected int def;
    protected int damage;
    protected int maxHp;
    protected int speed;


    static int prCount;

    public Person(int attack, int def, int damage, int maxHp, int speed) {
        this.attack = attack;
        this.def = def;
        this.damage = damage;
        this.maxHp = maxHp;
        this.speed = speed;
        prCount++;
    }
    public static int getPrCount(){return prCount;}

    @Override
    public void step() { }

    @Override
    public String getInfo() {return "";}


    public int getSpeed() {
        return speed;
    }
}

