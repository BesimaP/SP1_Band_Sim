    public class User {
        String username;
        int followers;
        int following;
        int posts;

        User(String username) {
            this.username = username;
            this.followers = 0;
            this.following = 0;
            this.posts = 0;
        }
    }

    void follow(User follower, User target) {
        follower.following = follower.following + 1;
        target.followers = target.followers + 1;
    }

    void unfollow(User follower, User target) {
        if (follower.following > 0) {
            follower.following = follower.following - 1;
        }
        if (target.followers > 0) {
            target.followers = target.followers - 1;
        }
    }

    void createPost(User user) {
        user.posts = user.posts + 1;
    }

    int calculateEngagement(User user) {
        return user.posts * user.followers;
    }

    void printTopUsers(User[] users, int count) {
        System.out.println("=== Top " + count + " Users ===");

        boolean[] printed = new boolean[users.length];

        for (int rank = 0; rank < count && rank < users.length; rank++) {
            int topIndex = -1;
            int topFollowers = -1;

            for (int i = 0; i < users.length; i++) {
                if (!printed[i] && users[i].followers > topFollowers) {
                    topFollowers = users[i].followers;
                    topIndex = i;
                }
            }

            if (topIndex != -1) {
                printed[topIndex] = true;
                System.out.println((rank + 1) + ". " + users[topIndex].username +
                        " - Followers: " + users[topIndex].followers +
                        ", Posts: " + users[topIndex].posts +
                        ", Engagement: " + calculateEngagement(users[topIndex]));
            }
        }
    }

    void main() {
        User[] users = new User[6];
        users[0] = new User("alice");
        users[1] = new User("bob");
        users[2] = new User("charlie");
        users[3] = new User("diana");
        users[4] = new User("eve");
        users[5] = new User("frank");

        // Simulate activity
        follow(users[0], users[1]);
        follow(users[0], users[2]);
        follow(users[1], users[2]);
        follow(users[2], users[1]);
        follow(users[3], users[1]);
        follow(users[4], users[1]);

        createPost(users[1]);
        createPost(users[1]);
        createPost(users[1]);
        createPost(users[2]);
        createPost(users[2]);

        printTopUsers(users, 3);
    }
