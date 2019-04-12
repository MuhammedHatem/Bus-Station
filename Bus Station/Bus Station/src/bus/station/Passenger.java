
package bus.station;


public class Passenger extends User{
    
        private String Source ;
        private String Destination ;
        private static int ROO ; // round trip => 0 , one way trip => 1
        private static int V_T ;
         
        public Passenger(String ID, String name, int Pass){
        setID(ID);
        setName(name);
        setPass(Pass);
    }

     
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }


    public int getPass() {
        return Pass;
    }


    public void setPass(int Pass) {
        this.Pass = Pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void Book_Ticket(String source , String Destination , String Trip_type , Trips trip ,String Transportation_Vehicle)
    {
        this.Source = Source;
        this.Destination = Destination;
        if (Trip_type.equals("one way trip"))
        this.ROO = 0;
        else if(Trip_type.equals("round trip"))
        this.ROO = 1;
         if (Transportation_Vehicle.equals("Bus"))
             setV_T(0);
         if (Transportation_Vehicle.equals("Mini Bus"))
             setV_T(1);
         if (Transportation_Vehicle.equals("Car"))
             setV_T(2);
         int x = trip.getAvilable_Seat();
         trip.setAvilable_Seat(x-1);
         
    }
    
    public void Cancellation(Trips trip)
    {
         int x = trip.getAvilable_Seat();
         trip.setAvilable_Seat(x+1);
    }

    public String getSource() {
        return Source;
    }

    public String getDestination() {
        return Destination;
    }

    public static int getROO() {
        return ROO;
    }

    public static int getV_T() {
        return V_T;
    }

    public static void setV_T(int V_T) {
        Passenger.V_T = V_T;
    }


    
}
