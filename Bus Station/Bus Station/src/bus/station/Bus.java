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
public class Bus extends Vehicles{
    final int Number_OF_Seats = 24 ;

    public int getNumber_OF_Seats() {
        return Number_OF_Seats;
    }
    
    public Bus() {
        super.setVechicle_ID();
        
        
    }

    
    
}
