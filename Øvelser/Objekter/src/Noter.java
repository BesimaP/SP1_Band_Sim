import java.util.Random;
import java.util.Scanner;
public class Noter {
    void main() {
        //int randomNum = (int) (Math.random() * 11);
        Random r = new Random();
        int rnd = r.nextInt(10)+1;

        System.out.println("Guess a number: ");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        while (rnd > 0) {
            System.out.println("Gæt endnu et tal!");
            input = scan.nextInt();

            if(input == rnd){
                System.out.println("Godt gættet!" + "Taller er: " + rnd);
                break;
            } else if (input > rnd){
                System.out.println("Prøv et lavere tal!");
            } else if (input < rnd){
                System.out.println("Prøv et højere tal!");
            }
        }
        System.out.println("Tallet er: " + rnd + ". Godt gættet!");
    }
}
