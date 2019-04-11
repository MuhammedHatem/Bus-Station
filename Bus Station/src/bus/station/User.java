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
public abstract class User {
    String ID ;
    int Pass ;
    String name ;

    abstract String getID() ;
    

     abstract void setID(String ID);
    

    abstract int getPass() ;
    

    abstract void setPass(int Pass);
 
    

     abstract String getName();
      

    abstract void setName(String name) ;
    
    
    
    
    
}
