package Assignment_4;

import java.util.ArrayList;

    public class Team {
        String teamName;
        ArrayList<Player> players = new ArrayList<>();

        public Team(String teamName) {
            this.teamName = teamName;
            this.players = new ArrayList<>();
        }

        public void addPlayer(Player p) {
            players.add(p);
            System.out.println(p.name + " tilføjet til " + teamName);
        }

        public double getAverageSkill() {
            if (players.size() == 0) {
                return 0;
            }

            int totalSkill = 0;
            for(Player p : players){
                totalSkill = totalSkill + p.skillLevel;
            }
            return (double)totalSkill / players.size();
        }

        public void printTeam() {
            System.out.println("\n=== " + teamName + " ===");
            System.out.println("Spillere:");
            for (Player p : players) {
                System.out.println("- " + p);
            }
            System.out.println("Gennemsnitlig skill: " + getAverageSkill());
        }

        public void compete(Team opponent) {
            System.out.println("\n=== " + teamName + " vs " + opponent.teamName + " ===");
            double mySkill = getAverageSkill();
            double opponentSkill = opponent.getAverageSkill();

            System.out.println(teamName + " skill: " + mySkill);
            System.out.println(opponent.teamName + " skill: " + opponentSkill);

            if (mySkill > opponentSkill) {
                System.out.println("Vinder: " + teamName);
            } else if (opponentSkill > mySkill) {
                System.out.println("Vinder: " + opponent.teamName);
            } else {
                System.out.println("Uafgjort!");
            }
        }
    }
