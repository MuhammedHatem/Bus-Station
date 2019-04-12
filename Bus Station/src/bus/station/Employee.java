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
    
    public void Add_The_User() throws IOException
    {
        String str = "User`s ID :"+ ID + "     "+"User`s Name :"+name+"     "+"User`s Password :"+Pass +"     "+"User`s Position :"+" "+"Driver";
        // attach a file to FileWriter  
        FileWriter fw=new FileWriter("Drivers.txt",true); 
        for (int i = 0; i < str.length(); i++) 
            fw.write(str.charAt(i)); 
        fw.write(System.getProperty( "line.separator" ));
        fw.close(); 
    }
    
     public void Display_User()
     {
         String str = "User`s ID :"+ ID + "     "+"User`s Name :"+name+"     "+"User`s Password :"+Pass +"     "+"User`s Position :"+" "+"Driver";
         System.out.println(str);
     }
    
    
    public void Display_ALL() throws IOException
     {
      int ch; 
  
        // check if File exists or not 
        FileReader fr=null; 
        try
        { 
            fr = new FileReader("Drivers.txt"); 
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
    
    
}
