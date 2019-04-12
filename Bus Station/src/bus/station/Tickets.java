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
    private static int Unique_ID = 0;
    private int ID ; 
    private int type; 
    private double price;
    private int tripId;
    private int Vehicle_Type; //bus=> 0 , mini bus => 1 , car => 2
    private String Passenger_ID;
    private double Final_Price ;
    
    public int getTripId() {
        return tripId;
    }

    public void setTripId(Trips trip) {
        this.tripId = trip.getTripId();
    }

    public Tickets(Trips trip,double price,Passenger pg){
        setUnique_ID();
        setTripId(trip);
        type = pg.getROO();
        if (type == 1)
        setPrice(price*(80/100));
        if (type == 0)
        setPrice(price);
        this.Vehicle_Type = pg.getV_T();
        this.Passenger_ID = pg.getID();
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

    public int getVehicle_Type() {
        return Vehicle_Type;
    }

    public void setVehicle_Type(int Vehicle_Type) {
        this.Vehicle_Type = Vehicle_Type;
    }

    public int getUnique_ID() {
        return Unique_ID;
    }

    public void setUnique_ID() {
       setID();
       this.Unique_ID =  this.Unique_ID + 1 ;
        
        
    }

    public int getID() {
        return ID;
    }

    public void setID() {
        this.ID = this.Unique_ID;
    }

    public double getFinal_Price() {
        return Final_Price;
    }

    public void setFinal_Price(Trips trip) {
        this.Final_Price = this.price+trip.getPrice();
    }
    
 
    
}
