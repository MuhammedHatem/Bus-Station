
package bus.station;


public class Passenger extends User{
    
        private String Source ;
        private String Destination ;
        private int ROO ; // round trip or one way trip
        
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
    
    public void Book_Ticket(String source , String Destination , int Trip_type)
    {
        this.Source = Source;
    
        this.Destination = Destination;

        this.ROO = ROO;
    }

    public String getSource() {
        return Source;
    }

    public String getDestination() {
        return Destination;
    }

    public int getROO() {
        return ROO;
    }


    
}
