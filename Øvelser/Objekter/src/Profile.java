import java.util.ArrayList;

    public class Profile {
        String username;
        ArrayList<Profile> followers = new ArrayList<>();

        Profile(String username){
            this.username = username;
        }

        void addFollower(Profile p4){ //formelle navn
            this.followers.add(p4);
        }
    }
