package SP1_Band_Sim;

    public class Song {
        String title;
        int durationSeconds; //Varighed i sekunder
        int streams;           // antal streams

        //Constructor
        public Song(String title){
            this.title = title;
            this.durationSeconds = durationSeconds;
            this.streams = 0;
        }

        //Getters
        public  String getTitle(){
            return title;
        }

        public int getDurationSeconds(){
            return durationSeconds;
        }

        public int getStreams(){
            return streams;
        }
    }
