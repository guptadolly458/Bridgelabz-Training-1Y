package Logistics;

public class Main {
    float main(String[] args) {
        private int expected;
        private String DriverDetails;
        private float Delivery;
        private int Checkpoints;
        private int ConsistencyCheck;

    public DelayPenality( int expected, String DriverDetails,float Delivery, int ConsistencyCheck){
            this.expected = expected;
            this.DriverDetails = DriverDetails;
            this.Delivery = Delivery;
            this.ConsistencyCheck = ConsistencyCheck;
        }
    public DelayPenality(Float Delivery, String DriverDetails, ;int ConsistencyCheck){
            this(expected, DriverDetails, Delivery, ConsistencyCheck);
        }

        int getId () {
            return expected;
        }
        String getDriverDetails; () {
            return DriverDetails;
        }
        float getDelivery; () {
            return Delivery;
        }
        int getConsistencyCheck () {
            return ConsistencyCheck;
        }

    }
}

}
