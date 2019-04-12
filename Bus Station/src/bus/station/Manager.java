/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus.station;
import java.io.*;
/**
 *
 * @author Nayera Hatem
 */
public class Manager extends User implements Admin {
    private int index;
  
    public Manager (String ID, String name, int Pass){
        setID(ID);
        setName(name);
        setPass(Pass);
    }

  
    String getID() {
       return ID ;
    }


    void setID(String ID) {
        this.ID = ID ;
    }


    int getPass() {
        return Pass;
    }


    void setPass(int Pass) {
        this.Pass = Pass;
    }


    String getName() {
       return name;
    }


    void setName(String name) {
       this.name = name;
    }


    public void Add_Trips() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public void Remove_Trips() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public void Manage_Trips(Trips trip,Employee driver) {
        trip.setDriverID(driver.getID());
        driver.setAssigned_TripsID(trip.getTripId(),index);
        index = index + 1;
        // maximum the driver can be assigned to 10 trips
    }
    
}
