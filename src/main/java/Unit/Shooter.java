package Unit;

/**
 * Абстрактный класс Стрелок
 */
public abstract class Shooter extends Person{

    float dist;
    public String name;

    public Shooter(int hp, int damage, int def,float dist, String name) {
        super(hp, damage, def);
        this.dist = dist;
        this.name = name;
       }
}
