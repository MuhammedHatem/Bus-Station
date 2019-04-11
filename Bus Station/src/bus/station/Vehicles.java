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
public class Vehicles {
    private static int Vechicle_ID = 1110;
    private int ID ;

    public int getID() {
        return ID;
    }

    public void setID() {
        this.ID = this.Vechicle_ID;
    }


    public int getVechicle_ID() {
        return Vechicle_ID;
    }

    public void setVechicle_ID() {
         setID() ;
         this.Vechicle_ID =  this.Vechicle_ID + 1 ; 
    }


    
    
    
    
    
}
