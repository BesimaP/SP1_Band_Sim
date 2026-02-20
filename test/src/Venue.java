public class Venue {
        String name;
        int capacity;
        double payoutAmount;

        public Venue(String name, int capacity, double payoutAmount){
            this.name = name;
            this.capacity = capacity;
            this.payoutAmount = payoutAmount;
        }

        public String getName (){
            return name;
        }

        public int getCapacity(){
            return capacity;
        }

        public double payoutAmount(){
            return payoutAmount;
        }
    }
