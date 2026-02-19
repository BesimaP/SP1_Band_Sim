package SP1_Band_Sim;

    public class Event {
        int type;
        String description;
        int fanImpact;
        double moneyImpact;

        public Event(int type, String description, int fanImpact, double moneyImpact){
            this.type = type;
            this.description = description;
            this.fanImpact = fanImpact;
            this.moneyImpact = moneyImpact;
        }
    }
