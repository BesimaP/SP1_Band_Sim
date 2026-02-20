import java.util.ArrayList;
import java.util.Random;

//Opretter klasse
public class Band { //definerer felter
    String bandName;
    char genre;
    int fans;
    int maxFans;
    int fameLevel;
    int experiencePoints;
    double money;
    boolean isActive;
    ArrayList<Song> songs = new ArrayList<>();
    Random random;



    //Constructor
    public Band(String bandName, char genre, int fans, int maxFans, int fameLevel,
                int experiencePoints, double money, ArrayList<Song> songs) { //initialiseer felterne med startværdi
        this.bandName = bandName;
        this.genre = genre;
        this.fans = fans;
        this.maxFans = maxFans;
        this.fameLevel = fameLevel;
        this.experiencePoints = experiencePoints;
        this.money = money;
        this.isActive = true;
        this.songs = songs;
        this.random = new Random();
    }



    //Print band profile
    void printProfile() { //printer objekternes data
        System.out.println();
        System.out.println("~~~~~~ BAND PROFILE ~~~~~~");
        System.out.println("Bandname: " + bandName);
        System.out.println("Fans: " + fans);
        System.out.println("Max fans: " + maxFans);
        System.out.println("Famelevel: " + fameLevel);
        System.out.println("ExperiencePoints: " + experiencePoints);
        System.out.println("Money: " + money);
        System.out.println("Active: " + isActive);
        System.out.println("Genre: " + genre);



        System.out.println("~~~~~~~~~ SONGS ~~~~~~~~~");
        for (Song song : songs) {
            System.out.println("- " + song.title);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");



        //Genre besked
        switch (genre) {
            case 'R':
                System.out.println("Genre R: Rock on!");
                break;
            case 'E':
                System.out.println("Genre E: Electronic vibes.");
                break;
            case 'H':
                System.out.println("Genre H: HipHop in the house!");
                break;
            case 'P':
                System.out.println("Genre P: Pop sensation!");
                break;
            default:
                System.out.println("Invalid genre");
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }


    /*if (isLosingRelevanc) {
        System.out.println("WARNING: Losing relevance! Consider a comeback strategy.");
        if (!isActive()) System.out.println("The band has broken up…");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

     */



    //Check band status
    void checkStatus() {
        System.out.println("~~~~~~ STATUS CHECK ~~~~~~");
        if (this.fans <= 0) { //tjekker om bandet er opløst. Hvis bandet har 0 eller færre fans, bliver det inaktivt og metoden stopper med return.
            System.out.println("The band has broken up");
            return;
        }
        if (this.fans < this.maxFans * 0.25) { //tjekker om bandet mister relevans. Hvis fans er under 26% af maxFans, printes advarsel.
            System.out.println("WARNING: Losing relevance! Consider a comeback strategy");
        }
        switch (this.genre) { //printer en besked baseret på genre
            case 'R':
                System.out.println("Rock on!");
                break;
            case 'E':
                System.out.println("Electronic vibes");
                break;
            case 'H':
                System.out.println("Heavy sound!");
                break;
            case 'P':
                System.out.println("Pop appeal");
                break;
            default:
                System.out.println("Genre unkown");
                break;
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
    }



    //Fame system
    void fameSystem() { //Hvert fameLevel kræver en bestemt mængde XP (experiencePoints) for at kunne “level up”.
        int threshold = 2000 * fameLevel;
        if (experiencePoints >= threshold) { //tjekker om man kan level op. Hvis bandets XP er større eller lig med threshold, printes en besked.
            System.out.println("Ready to level up!");
        }
        System.out.println("~~~~~~ FAME LEVEL ~~~~~~");
        switch (this.fameLevel) { //Afhængig af fameLevel printer metoden en tekst
            case 1:
                System.out.println("Unknown - Playing in garages");
                break;
            case 2:
                System.out.println("Local Hero - Small venues await");
                break;
            case 3:
                System.out.println("Rising Star - Festival invitations coming in");
                break;
            case 4:
                System.out.println("Mainstream - Arena tour possible");
                break;
            case 5:
                System.out.println("Superstar - Stadium");
                break;
            default:
                System.out.println("Invalid fame level");
        }
    }



    // Add XP
    void addXP(int amount) { //Tilføjer XP til bandet
        experiencePoints += amount;
        System.out.println(bandName + ": " + amount + " XP added! Total XP: " + experiencePoints);
        levelUp(); // kalder levelUp for at tjekke om bandet kan stige i famelevel
    }



    // Level up
    void levelUp() { //Tjekker om bandet har nok XP til at stige i famelevel.
        int threshold = 2000 * fameLevel;
        if (experiencePoints >= threshold) {
            fameLevel++; //hvis ja, øger fameLevel med 1 og printer en besked
            System.out.println("Congratulations! Levelled up to fame level " + fameLevel);
        }
    }



    // Spend money
    boolean spendMoney(double amount) { //tjekker om bandet kan betale
        if (money >= amount) { //tjekker om bandet kan betale
            money -= amount; // pengene trækkes fra feltet money
            return true;
        } else { // hvis ikke nok penge retunerer false
            return false;
        }
    }



    // Earn money
    void earnMoney(double amount) { // Tilføjer et beløb til bandets money
        money += amount; //Printer resultatet med totalen
        System.out.println("Earned $" + amount + "! Total money: $" + money);
    }



    // Play gig
    void playGig(int venueCapacity, int attendance) {
        // Publikum bestemmer hvor meget bandet tjener og hvor mange fans bandet får
        // Math.min sikrer, at publikum ikke overstiger lokalet
        int audience = Math.min(attendance, venueCapacity);

        // Fans stiger: 1 ny fan for hver 5 tilskuere
        fans += audience / 5;

        // Penge stiger: bandet tjener 5 penge per tilskuer
        money += audience * 5;

        //Tilføj experiencePoints: 1 XP per tilskuer
        experiencePoints += audience;

        // Print resultat af koncerten
        System.out.println(bandName + ": " + "Gig played! Audience: " + audience + ", Fans gained: " + (audience / 5));
    }



    // Random event
    void randomEvent() {
        // Vælg en tilfældig begivenhed (0, 1 eller 2)
        int event = random.nextInt(3);

        // Switch til at bestemme, hvad der sker
        switch (event) {
            case 0:
                // Koncerten var en succes: flere fans
                System.out.println(bandName + ": " + "Random Event: Your song went viral! Fans +500");
                fans += 500;
                break;
            case 1:
                // Tekniske problemer: tab af fans
                System.out.println(bandName + ": " + "Random Event: Bad weather at gig, income -$500");
                money -= 500;
                break;
            case 2:
                // Bonus penge: bandet tjener ekstra
                System.out.println(bandName + ": " + "Random Event: Energy boost! Experience +20");
                experiencePoints += 20;
                break;
            default:
                System.out.println("No event happened.");
        }
    }



    // Gain fans
    void gainFans(int amount) {
        //Tilføjer nye fans til bandet
        fans += amount;

        // Print hvor mange fans der blev tilføjet og totalen
        System.out.println(amount + " fans gained! Total fans: " + fans);
    }



    // Lose fans
    void loseFans(int amount) {
        // Trækker et antal fans fra bandets samlede fans
        fans -= amount;

        // Sørg for, at antal fans ikke bliver negativt
        if (fans < 0)
            fans = 0;

        // Print hvor mange fans der blev mistet og totalen
        System.out.println(amount + " fans lost! Total fans: " + fans);
    }



    // Check if active
    // Print hvor mange fans der blev mistet og totalen
    boolean isActive() {
        return fans > 0;
        // true = bandet kan spille koncerter, false = bandet er opløst
    }



    //Fanpercentage
    // Beregner og returnerer procentdelen af bandets fans i forhold til maxFans
    double getFanPercentage() {
        return (double) fans / maxFans * 100;
    }



    // Check losing relevance
    boolean isLosingRelevance() {
        // Tjekker om bandets fans er mindre end 25% af maxFans
        if(fans < maxFans * 0.25){
            return true; // Bandet mister relevant
        } else {
            return false; // Bandet er stadig relevant
        }
    }

    public String getStatusTitle(){
            switch (fameLevel) {
                case 1:
                    return "Unknown - Playing in garages";
                case 2:
                    return "Local Hero - Small venues await";
                case 3:
                    return "Rising Star - Festival invitations coming in";
                case 4:
                    return "Mainstream - Arena tours possible";
                case 5:
                    return "Superstar - Stadium glory!";
                default:
                    return "Legend";
            }
    }
}