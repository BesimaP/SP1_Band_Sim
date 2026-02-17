    public class Game {
    // Opgave 3: Gem klasse og Opgave 4: Ændre instance varibales
        String name;
        int players;
        boolean multiplayer;

        Game(String name, int players, boolean multiplayer) {
            this.name = name;
            this.players = players;
            this.multiplayer = multiplayer;
        }
    }

    void main(){
        Game game = new Game("Minecraft", 4, true);
        System.out.println("Game name: " + game.name + "\n" +"Player number: "+game.players);
        Game game1 = new Game("Chess", 2, true);
        System.out.println("Player number: " + game1.players);
        game1.players = 4;
        System.out.println("Updated player number: " + game1.players);
    }

