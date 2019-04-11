/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus.station;

/**
 *
 * @author Nayera Hatem
 */
public class Tickets {
    private int type;
    private double price;
    private int tripId;

    public int getTripId() {
        return tripId;
    }

    public void setTripId(Trips trip) {
        this.tripId = trip.getTripId();
    }

    public Tickets(int type, double price,Trips trip){
        setType(type);
        setPrice(price);
        setTripId(trip);
        
    }
    
    
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
    
}
