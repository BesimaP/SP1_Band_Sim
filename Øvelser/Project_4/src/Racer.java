    public class Racer {
        String name;
        int position;
        int speed;

        Racer(String name, int speed) {
            this.name = name;
            this.position = 0;
            this.speed = speed;
        }
    }

    void race(Racer[] racers, int laps) {
        for (int lap = 0; lap < laps; lap++) {
            for (int i = 0; i < racers.length; i++) {
                racers[i].position = racers[i].position + racers[i].speed;
            }
        }
    }

    int findWinner(Racer[] racers) {
        int winnerIndex = 0;
        for (int i = 1; i < racers.length; i++) {
            if (racers[i].position > racers[winnerIndex].position) {
                winnerIndex = i;
            }
        }
        return winnerIndex;
    }

    void printStandings(Racer[] racers) {
        System.out.println("=== Race Standings ===");

        boolean[] printed = new boolean[racers.length];

        for (int place = 0; place < racers.length; place++) {
            int bestIndex = -1;
            int bestPosition = -1;

            for (int i = 0; i < racers.length; i++) {
                if (!printed[i] && racers[i].position > bestPosition) {
                    bestPosition = racers[i].position;
                    bestIndex = i;
                }
            }

            printed[bestIndex] = true;
            System.out.println((place + 1) + ". " + racers[bestIndex].name + " - Position: " + racers[bestIndex].position);
        }
    }

    void main() {
        Racer[] racers = new Racer[4];
        racers[0] = new Racer("Lightning", 25);
        racers[1] = new Racer("Storm", 30);
        racers[2] = new Racer("Thunder", 20);
        racers[3] = new Racer("Blaze", 28);

        race(racers, 5);

        printStandings(racers);

        int winner = findWinner(racers);
        System.out.println("\nWinner: " + racers[winner].name);
    }
