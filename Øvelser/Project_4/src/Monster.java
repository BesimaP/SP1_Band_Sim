    public class Monster {
        String name;
        String type;
        int level;

        Monster (String name, String type, int level){
            this.name = name;
            this.type = type;
            this.level = level;
        }
    }

    int  countType(Monster[] monsters, String type) {
        int count = 0;
        for (int i = 0; i < monsters.length; i++) {
            if (monsters[i].type.equals(type)) {
                count = count + 1;
            }
        }
        return count;
    }

    void main () {
        Monster[] monsters = new Monster[6];
        monsters[0] = new Monster("Charmander", "Fire", 5);
        monsters[1] = new Monster("Squirtle", "Water", 5);
        monsters[2] = new Monster("Bulbasaur", "Grass", 5);
        monsters[3] = new Monster("Vulpix", "Fire", 10);
        monsters[4] = new Monster("Psyduck", "Water", 8);
        monsters[5] = new Monster("Charizard", "Fire", 36);

        int fireCount = countType(monsters, "Fire");
        System.out.println("Fire type monsters: " + fireCount);
    }
