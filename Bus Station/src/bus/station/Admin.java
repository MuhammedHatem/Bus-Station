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
public interface Admin {
    void Add_Trips (String Source , String Destination,String Time)throws IOException;
    
    void Remove_Trips () throws IOException;
    
    void Manage_Trips(Trips trip,Employee driver);
    
}
