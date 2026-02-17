public class Pokemon {
    String name;
    int level;
    int hp;

    Pokemon (String name, int level, int hp){
        this.name = name;
        this.level = level;
        this.hp = hp;
    }

    Pokemon (String name, int level){
        this.name = name;
        this.level = level;
    }
}

    void levelUp(Pokemon p){
        p.level = p.level + 1;
        p.hp = p.hp + 10;
    }

    void printStatus(Pokemon p) {
        if (p.hp <= 0){
            System.out.println("Fainted");
        } else if (p.hp < 30){
            System.out.println("Critical");
        } else if (p.hp < 70){
            System.out.println("Hurt");
        } else {
            System.out.println("Healthy");
        }
    }

    int countHealthy(Pokemon[] team){
    int count = 0;
    for(int i = 0; i < team.length; i++)
        if(team[i].hp > 50){
            count++;
        }
    return count;
    }

    int findWeakest(Pokemon[] pokemons) {
        int weakestIndex = 0;
        for (int i = 0; i < pokemons.length; i++){
            if (pokemons[i].hp > pokemons[weakestIndex].hp){
                weakestIndex = i;
            }
        }
        return weakestIndex;
    }

    void healTeam(Pokemon[] pokemons, int healAmount){
        for(int i = 0; i < pokemons.length; i++){
            pokemons[i].hp = pokemons[i].hp + healAmount;
            if (pokemons[i]. hp > 100){
                pokemons[i].hp = 100;
            }
        }
    }

    void attack(Pokemon attacker, Pokemon defender){
        System.out.println(attacker.name + " attacks " + defender.name + "!");
        defender.hp = defender.hp - attacker.level;
    }

    int countAlive(Pokemon[] team) {
        int count = 0;
        for (int i = 0; i < team.length; i++) {
            if (team[i].hp > 0) {
                count = count + 1;
            }
        }
    return count;
    }

    Pokemon[] getAliveTeam(Pokemon[] team) {
        int aliveCount = countAlive(team);
        Pokemon[] aliveTeam = new Pokemon[aliveCount];

        int index = 0;
        for (int i = 0; i < team.length; i++) {
            if (team[i].hp > 0) {
                aliveTeam[index] = team[i];
                index = index + 1;
            }
        }
        return aliveTeam;
    }

    void battleTeams(Pokemon[] team1, Pokemon[] team2) {
        for (int i = 0; i < team1.length; i++) {
            int targetIndex = i % team2.length;
            System.out.println(team1[i].name + " attacks " + team2[targetIndex].name);
            team2[targetIndex].hp = team2[targetIndex].hp - team1[i].level;
        }

        int total1 = 0;
        int total2 = 0;

        for (int i = 0; i < team1.length; i++) {
            total1 = total1 + team1[i].hp;
        }

        for (int i = 0; i < team2.length; i++) {
            total2 = total2 + team2[i].hp;
        }

        System.out.println("Team 1 total HP: " + total1);
        System.out.println("Team 2 total HP: " + total2);
    }

    void main () {
        Pokemon pokemon = new Pokemon("Pikachu", 25);
        System.out.println("Name: " + pokemon.name + "\n" + "Level: " + pokemon.level);
        Pokemon bulbasaur = new Pokemon("Bulbasaur", 5, 45);
        System.out.println("Name: " + bulbasaur.name + "\n" + "Level: " + bulbasaur.level + "\n" + "Hp: " + bulbasaur.hp + "\n");
        levelUp(bulbasaur);
        levelUp(bulbasaur);
        levelUp(bulbasaur);
        System.out.println("Name: " + bulbasaur.name + "\n" + "Level: " + bulbasaur.level + "\n" + "Hp: " + bulbasaur.hp);

        Pokemon kokoon = new Pokemon("Kokoon", 25, 100);
        Pokemon venusau = new Pokemon("Venusau", 50, 50);
        Pokemon beedril = new Pokemon("Bedrill", 10, 20);
        Pokemon butterf = new Pokemon("Butterf", 15, 0);
        printStatus(kokoon);
        printStatus(venusau);
        printStatus(beedril);
        printStatus(butterf);

        Pokemon[] pokemons = new Pokemon[5];
        pokemons[0] = new Pokemon("Charman", 26, 100);
        pokemons[1] = new Pokemon("Wartort", 55, 200);
        pokemons[2] = new Pokemon("Pidge", 5, 60);
        pokemons[3] = new Pokemon("Squirtl", 15, 80);
        pokemons[4] = new Pokemon("Blastoi", 30, 90);

        int health = countHealthy(pokemons);
        System.out.println("Healthy Pokemon: " + health);

        int index = findWeakest(pokemons);
        System.out.println("Weakest: " + pokemons[index].name + " with " + pokemons[index].hp + " HP");
        System.out.println("======================");
        healTeam(pokemons, 30);

        for (int i = 0; i < pokemons.length; i++) {
            System.out.println(pokemons[i].name + ": " + pokemons[i].hp);
        }

        attack(kokoon, venusau);
        attack(venusau, kokoon);
        attack(kokoon, venusau);

        System.out.println(kokoon.name + ": " + kokoon.hp + " HP");
        System.out.println(venusau.name + ": " + venusau.hp + " HP");

        Pokemon[] aliveTeam = getAliveTeam(pokemons);

        System.out.println("Alive Pokemon:");
        for (int i = 0; i < aliveTeam.length; i++) {
            System.out.println(aliveTeam[i].name);
        }

        Pokemon[] team1 = new Pokemon[3];
        team1[0] = new Pokemon("Pikachu", 25, 100);
        team1[1] = new Pokemon("Charizard", 50, 150);
        team1[2] = new Pokemon("Bulbasaur", 10, 80);

        Pokemon[] team2 = new Pokemon[3];
        team2[0] = new Pokemon("Squirtle", 15, 90);
        team2[1] = new Pokemon("Jigglypuff", 20, 110);
        team2[2] = new Pokemon("Meowth", 12, 70);

        battleTeams(team1, team2);
    }