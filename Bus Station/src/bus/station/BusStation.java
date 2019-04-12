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
public class BusStation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Bus bus = new Bus();
        Bus bus1 = new Bus();
        Bus bus2 = new Bus();
        Bus bus3 = new Bus();
        Car car = new Car();
        Car car1 = new Car();
        Car car2 = new Car();
        Mini_Bus mb = new Mini_Bus();
        Mini_Bus mb1 = new Mini_Bus();
        Manager number_1 = new Manager("MN121","Mohammed",1234);
       // number_1.Add_Trips("Alex","okolhuma","3:30");
        //number_1.Add_Trips("Alexa","okolhuma","3:30");
        //number_1.Add_Trips("Alexb","okolhuma","3:30");
        Passenger p1 = new Passenger("IP124","Ahmed",1234);
        //p1.Add_The_User();
        Passenger p2 = new Passenger("IP1234","Ahmead",12234);
        //p2.Add_The_User();
        //Passenger Display = new Passenger("null","null",1234);
        //Display.Display_ALL(); // to display without a new user i used null 
        //p1.Display_User();
        //p2.Display_User();
        p1.Display_ALL();
        number_1.Remove_Trips("Alexa","okolhuma","3:30");
    }
    
}
