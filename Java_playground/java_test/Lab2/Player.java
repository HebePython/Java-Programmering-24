package Java_playground.java_test.Lab2;

public class Player {
    private String name;
    private int health;
    private int attack;
    private int defense;
    private int gold;

    public Player(String name, int health, int attack, int defense, int gold) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
        this.gold = gold;
    }

    public void attack(Enemy enemy) {
        int damage = this.attack - enemy.getDefense();
        if (damage > 0) {
            enemy.takeDamage(damage);
        }
    }

    public void takeDamage(int damage) {
        this.health -= damage;
    }

    public void addGold(int gold) {
        this.gold += gold;
    }

    public void removeGold(int gold) {
        this.gold -= gold;
    }

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.health;
    }

    public int getAttack() {
        return this.attack;
    }

    public int getDefense() {
        return this.defense;
    }

    public int getGold() {
        return this.gold;
    }
    
}
