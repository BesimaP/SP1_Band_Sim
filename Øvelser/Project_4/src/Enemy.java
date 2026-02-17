public class Enemy {
    String name;
    int health;
    int damage;

    Enemy(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }
}

    void printEnemy(Enemy e){
        System.out.println("Name: " + e.name);
        System.out.println("Health: " + e.health);
        System.out.println("Damage: " + e.damage);
    }

    void takeDamge(Enemy e, int damage){
        e.health = e.health - damage;
    }

    boolean isALive (Enemy e){
        if (e.health > 0){
            return true;
        } else {
            return false;
        }
    }

    void printAllEnemies(Enemy[] enemies){
        for(int i = 0; i < enemies.length; i++){
            System.out.println(enemies[i].name + ": " + enemies[i].health + " HP");
        }
    }

    void printAliveEnemies(Enemy[] enemies){
        for(int i = 0; i < enemies.length; i++){
            if (enemies[i].health > 0){
                System.out.println(enemies[i].name + " is alive");
            }
        }
    }

    void main(){
        Enemy goblin = new Enemy("Goblin", 50,10);
        printEnemy(goblin);
        Enemy orc = new Enemy ("Orc", 100, 15);

        System.out.println("Name: " + orc.name + ". Health: " + orc.health);
        takeDamge(orc,30);
        System.out.println("Name: " + orc.name + ". Health: " + orc.health);

        Enemy thor = new Enemy ("Thor", 80, 10);
        Enemy victor = new Enemy ("Victor", 90, 0);
        Enemy Manfred = new Enemy("Manfred", 90, 20);

        System.out.println(thor.name + " alive: " + isALive(thor));
        System.out.println(victor.name + " alive: " + isALive(victor));

        Enemy [] enemies = new Enemy[5];
        enemies [0] = new Enemy ("Frederik", 80, 10);
        enemies [1] = new Enemy ("Malte", 90, 0);
        enemies [2] = new Enemy("Rox", 90, 20);
        enemies [3] = new Enemy ("Emily", 200,10);
        enemies [4] = new Enemy ("Liam", 180,20);
        printAllEnemies(enemies);
        System.out.println("==========================");
        printAllEnemies(enemies);
    }