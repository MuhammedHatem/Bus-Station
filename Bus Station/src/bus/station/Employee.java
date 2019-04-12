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
public class Employee extends User{
    private int[] Assigned_TripsID = new int[10] ;

 public Employee (String ID, String name, int Pass){
        setID(ID);
        setName(name);
        setPass(Pass);
    }
    
    String getID() {
        return ID ;
    }

    
    void setID(String ID) {
        this.ID = ID;
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
    
    public int[] getAssigned_TripsID() {
        return Assigned_TripsID;
    }

    public void setAssigned_TripsID(int Assigned_TripsID,int i) {
        this.Assigned_TripsID[i] = Assigned_TripsID;
    }
    
    
    public static void Display()
     {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
