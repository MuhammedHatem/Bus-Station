
package bus.station;


public class Trips {
    private int tripId; 
    private int flavors; //(nonstop => 0, one-stop=> 1, many stops=>2)
    private int type; //external => 0 , internal => 1
    private 
    
    public Trips(int tripId, int flavors, int type){
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
    
    
}
