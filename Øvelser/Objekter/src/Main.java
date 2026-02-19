import java.util.ArrayList;
    public class Main {
    //Slinder
        static ArrayList<Profile> allProfiles = new ArrayList<>();

        public static void main(String [] args) {
            createProfiles();
            //createPosts();
            Profile p1 = getProfileByIndex(3);
            Profile p2 = getProfileByIndex(1);

            if(p1.followers.size() > p2.followers.size()){

            }
        }

        private static void createPosts() {
            Post p = new Post("Besima", ": I dag har jeg vasket min mors bil");
            Post p1 = new Post("Louise", ": I dag har jeg købt en bolle i kantinen");
            Post p2 = new Post("Gabriella", ": Jeg er i skole i dag");
            System.out.println(p.owner + p.textContent);
            System.out.println(p1.owner + p1.textContent);
            System.out.println(p2.owner + p2.textContent);

            //Test kode
            p.addLike();
            p1.addLike();
            p1.addLike();
            p1.addLike();
            p1.addLike();
            p1.unLikes();

            p1.addComment("cool");
            p1.addComment("Jeg vil også ned i kantinen");
            System.out.println("\n" + "Louise's post: " + p.textContent + "\n");
            p1.showComments();

            if (p.likes < p1.likes) {
                System.out.println(p1.owner + "'s post har flest likes");
            }

            System.out.println(p.owner + "'s post har " + p.likes + " likes");
            System.out.println(p1.owner + "'s post har " + p1.likes + " likes" + p1.comments);

            System.out.println(p1);
        }

        private static void createProfiles() {

            Profile p1 = new Profile("Besima");
            Profile p2 = new Profile("Louise");
            Profile p3 = new Profile("Olga");
            Profile p4 = new Profile("August");

            allProfiles.add(p1);
            allProfiles.add(p2);
            allProfiles.add(p3);
            allProfiles.add(p4);

            //TESTKODE
            p1.addFollower(p4); //Faktiske navn
            p1.addFollower(p2);
            p1.addFollower(p3);
            //p3 følger p2
            p3.addFollower(p2);

            displayAllProfiles(allProfiles);
            System.out.println("=========================================");
        }

        static void displayAllProfiles (ArrayList < Profile > list) {
            //For each loop gennemløber list og printer elementets brugernavn
            for (Profile p : list) {
                System.out.println(p.username + ", antal følgere: " + p.followers.size());
            }
        }

        static Profile getProfileByIndex (int i){
            Profile p;
            if(i > 0 && i >= allProfiles.size()) {
                p = allProfiles.get(i);
                return p;
            }
            return null;
        }
    }