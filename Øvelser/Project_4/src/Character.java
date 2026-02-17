    public class Character {
        String name;
        int health;
        int attackPower;
        int defense;
        int level;

        Character(String name, int health, int attackPower, int defense, int level){
            this.name = name;
            this.health = health;
            this.attackPower = attackPower;
            this.defense = defense;
            this.level = level;
        }
    }

    void takeDamage(Character c, int damage) {
        int actualDamage = damage - c.defense;
        if (actualDamage < 0) {
            actualDamage = 0;
        }
        c.health = c.health - actualDamage;
        if (c.health < 0) {
            c.health = 0;
        }
    }

    void levelUp(Character c) {
        c.level = c.level + 1;
        c.health = c.health + 20;
        c.attackPower = c.attackPower + 5;
        c.defense = c.defense + 3;
    }

    void printStats(Character c) {
        System.out.println("=== " + c.name + " ===");
        System.out.println("Level: " + c.level);
        System.out.println("Health: " + c.health);
        System.out.println("Attack: " + c.attackPower);
        System.out.println("Defense: " + c.defense);
        System.out.println();
    }

    void main() {
        Character warrior = new Character("Warrior", 100, 20, 10, 1);
        Character mage = new Character("Mage", 80, 30, 5, 1);

        takeDamage(mage, warrior.attackPower);
        takeDamage(warrior, mage.attackPower);

        levelUp(warrior);

        printStats(warrior);
        printStats(mage);
    }