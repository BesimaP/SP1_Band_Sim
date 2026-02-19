import java.sql.SQLOutput;
import java.util. Scanner;

    String [] destinations = new String [3];

    void proptDestination(){
          Scanner scan = new Scanner (System.in);
          for(int i = 0; i < destinations.length; i++){
              System.out.println("Pick your " +(i+1)+ ". dream vacation destination:");
              String userInput = scan.nextLine();
              destinations [i] = userInput;
          }
          System.out.println("Tak. Dit input er modtaget");
    }

    void showAllDestinations () {
        for (String destination : destinations) {
            System.out.println("- " + destination);
        }
    }

    void showRandomDestinations(){
        Random r = new Random();
        int randomNumber = r.nextInt(destinations.length);
        String randomDestination = destinations [randomNumber];
        System.out.println("I would choice: " + randomDestination);
    }

    void showDestinationByID(int id){
        String d = destinations[id-1];
        System.out.println("Destination by ID: " + d);
    }

    void main(){
        proptDestination();
        showAllDestinations();
        showRandomDestinations();
        //showLastDestination ();
        showDestinationByID (2);
    }