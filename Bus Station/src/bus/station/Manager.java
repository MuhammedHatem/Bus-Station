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
    
    
  
    public Manager (String ID, String name, int Pass)
    {
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

     public void Add_The_User() throws IOException
    {
        String str = "User`s ID :"+ ID + "     "+"User`s Name :"+name+"     "+"User`s Password :"+Pass +"     "+"User`s Position :"+" "+"Manager";
        // attach a file to FileWriter  
        FileWriter fw=new FileWriter("Managers.txt",true); 
        for (int i = 0; i < str.length(); i++) 
            fw.write(str.charAt(i)); 
        fw.write(System.getProperty( "line.separator" ));
        fw.close(); 
    }
    
    public void Add_Trips(String Source , String Destination,String Time) throws IOException {
        
        String str = "Source :"+ Source +"     "+"Destination :"+ Destination +"     "+ "Departs At :" +Time;
        // attach a file to FileWriter  
        FileWriter fw=new FileWriter("Trips.txt",true); 
        for (int i = 0; i < str.length(); i++) 
            fw.write(str.charAt(i)); 
        fw.write(System.getProperty( "line.separator" ));
        fw.close(); 
    }


    public void Remove_Trips() throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

       public void Display_User()
     {
         String str = "User`s ID :"+ ID + "     "+"User`s Name :"+name+"     "+"User`s Password :"+Pass +"     "+"User`s Position :"+" "+"Manager"; 
         System.out.println(str);
     }
    
     public void Display_ALL() throws IOException
     {
      int ch; 
  
        // check if File exists or not 
        FileReader fr=null; 
        try
        { 
            fr = new FileReader("Managers.txt"); 
        } 
        catch (FileNotFoundException fe) 
        { 
            System.out.println("File not found"); 
        } 
  
        // read from FileReader till the end of file 
        while ((ch=fr.read())!=-1) 
            System.out.print((char)ch); 
  
        // close the file 
        fr.close(); 
    } 
     

    public void Manage_Trips(Trips trip,Employee driver) {
        trip.setDriverID(driver.getID());
        driver.setAssigned_TripsID(trip.getTripId(),index);
        index = index + 1;
        // maximum the driver can be assigned to 10 trips
    }
    
}
