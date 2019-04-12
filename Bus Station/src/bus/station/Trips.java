
package bus.station;


public class Trips {
    private int tripId; 
    private int flavors; //(nonstop => 0, one-stop=> 1, many stops=>2)
    private int type; //external => 0 , internal => 1
    private double price ;
    private int distance ;
    private int Avilable_Seat;
    private int V_type ;
    private String DriverID;

    
    
    public Trips(int tripId, int flavors, int type , Tickets ticket ){
        V_type = ticket.getVehicle_Type();
        if (V_type == 0)
            Avilable_Seat = 24;
        if (V_type == 1)
            Avilable_Seat = 12;
        if (V_type == 2)
            Avilable_Seat = 4;
        setFlavors(flavors);
        setTripId(tripId);
        setType(type);
                
    }
    
    public int getFlavors() {
        return flavors;
    }

    public void setFlavors(int flavors) {
        this.flavors = flavors;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
    
    public int getTripId() {
        return tripId;
    }

    public void setTripId(int tripId) {
        this.tripId = tripId;
    }

    public void setPrice() {
        if (this.type == 0 )
        this.price = 60;
        else if (this.type == 1 )
        this.price = 40;
    }

    public double getPrice() {
        return price;
    }

        public int getAvilable_Seat() {
        return Avilable_Seat;
    }

    public void setAvilable_Seat(int Avilable_Seat) {
        this.Avilable_Seat = Avilable_Seat;
    }

    public String getDriverID() {
        return DriverID;
    }

    public void setDriverID(String DriverID) {
        this.DriverID = DriverID;
    }
    
    
}
