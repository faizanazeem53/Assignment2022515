/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author sweiss
 */
public class OOCMiniHW2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          // Instantiate a car object
         Drivable car = new Car("Toyota", "Sedan");
         car.accelerate(60);
         car.turn(30);
 
         // Instantiate an airplane object
         Flyable airplane = new Airplane("Boeing", "747");
         airplane.accelerate(500);
         airplane.changeAltitude(30000);
 
         // Instantiate a sailboat object
         Sailable sailboat = new Sailboat("Beneteau", "Oceanis");
         sailboat.hoistSail();
    }
    
}
