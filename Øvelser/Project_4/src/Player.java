    public class Player {
        String name;
        int score;

        Player (String name, int score){
            this.name = name;
            this.score = score;
        }
    }


    void printWinner(Player p1, Player p2){
        if (p1.score > p2.score){
            System.out.println(p1.name + " wins!");
        } else {
            System.out.println(p2.name + " wins!");
        }
    }

    int calculateTotalScore(Player[] players) {
        int total = 0;
        for(int i = 0; i < players.length; i++){
            total = total + players[i].score;
        }
        return total;
    }

    int findPlayerByName(Player[] players, String name) {
       for(int i = 0; i < players.length; i++){
           if (players[i].name.equals(name)){
               return i;
           }
       }
    return -1;
    }

    int findHighestScore(Player[] players) {
        int highestIndex = 0;
        for (int i = 0; i < players.length; i++){
            if (players[i].score > players[highestIndex].score){
              highestIndex = i;
            }
        }
        return highestIndex;
    }

    void printTop3(Player[] players1) {
        int first = 0;
        for (int i = 0; i < players1.length; i++) {
            if (players1[i].score > players1[i].score) {
                first = i;
            }
        }
        System.out.println("1st: " + players1[first].name + " - " + players1[first].score);

        int second = 0;
        if (second == first) second = 1;
        for (int i = 0; i < players1.length; i++) {
            if (i != first && players1[i].score > players1[second].score) {
                second = i;
            }
        }
        System.out.println("2nd: " + players1[second].name + " - " + players1[second].score);

        int third = 0;
        if (third == first || third == second) third = 1;
        if (third == first || third == second) third = 2;
        for (int i = 0; i < players1.length; i++) {
            if (i != first && i != second && players1[i].score > players1[third].score) {
                third = i;
            }
        }
        System.out.println("3rd: " + players1[third].name + " - " + players1[third].score);
    }

    void swapPlayers(Player[] players, int index1, int index2){
        Player temp = players[index1];
        players[index1] = players[index2];
        players[index2] = temp;
    }

    void main (){
        Player Player = new Player ("Louise", 12);
        Player Player2 = new Player ("August", 10);
        Player Player3 = new Player ("Elvis", 20);
        System.out.println(Player.name + ": "+ Player.score);
        System.out.println(Player2.name + ": "+ Player2.score);
        System.out.println(Player3.name + ": "+ Player3.score);
        Player Gabriella = new Player ("Gabriella", 150);
        Player Martin = new Player ("Martin", 120);
        printWinner(Gabriella, Martin);

        Player[] players = new Player[4];
        players[0] = new Player("Louise", 100);
        players[1] = new Player("August", 150);
        players[2] = new Player("Lukas", 75);
        players[3] = new Player("Besima", 200);

        int total = calculateTotalScore(players);
        System.out.println("Total score: " + total);

        int index = findPlayerByName(players, "Louise");
        System.out.println("Louise found at index: " + index);

        int highestIndex = findHighestScore(players);
        System.out.println("Highest score: " + players[highestIndex].name + " with " + players[highestIndex].score);

        Player[] players1 = new Player[7];
        players1[0] = new Player("Anna", 100);
        players1[1] = new Player("Mikkel", 250);
        players1[2] = new Player("Sofie", 175);
        players1[3] = new Player("Lars", 200);
        players1[4] = new Player("Emma", 180);
        players1[5] = new Player("Peter", 90);
        players1[6] = new Player("Maria", 220);

        printTop3(players1);

        for (int i = 0; i < players.length; i++){
            System.out.println(players[i].name);
        }

        System.out.println("--- After swap ---");
        swapPlayers(players, 0,2);

        for (int i = 0; i < players.length; i++){
            System.out.println(players[i].name);
        }
    }

