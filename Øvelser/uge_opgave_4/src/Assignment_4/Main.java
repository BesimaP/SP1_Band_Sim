package Assignment_4;

    public class Main {
        public static void main(String[] args) {
            Team redTeam = new Team("Røde Dragoner");
            Team blueTeam = new Team("Blå Hajer");

            // Tilføj spillere til rødt hold
            redTeam.addPlayer(new Player("Anna", 85));
            redTeam.addPlayer(new Player("Peter", 72));
            redTeam.addPlayer(new Player("Maria", 90));

            // Tilføj spillere til blåt hold
            blueTeam.addPlayer(new Player("Lars", 78));
            blueTeam.addPlayer(new Player("Emma", 82));
            blueTeam.addPlayer(new Player("Simon", 88));
            blueTeam.addPlayer(new Player("Sofia", 75));

            // Print teams
            redTeam.printTeam();
            blueTeam.printTeam();

            // Konkurrence
            redTeam.compete(blueTeam);
        }
    }
