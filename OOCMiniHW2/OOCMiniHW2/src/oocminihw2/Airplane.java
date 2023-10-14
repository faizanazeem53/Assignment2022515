/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author Faizan
 */
// Flyable interface implementation
public class Airplane extends Vehicle implements Flyable {
    private float altitude = 0;

    public Airplane(String make, String type) {
        this.make = make;
        this.type = type;
        this.numWings = 2;
        this.numPassengers = 100;
    }

    @Override
    public void accelerate(float speed) {
        this.speed += speed; // Increase the airspeed
    }

    @Override
    public void brake() {
        this.speed = 0; // Stop the airplane
    }

    @Override
    public void turn(float angle) {
        this.direction += angle; // Change the heading
    }

    @Override
    public float getDirection() {
        return direction;
    }

    @Override
    public float getSpeed() {
        return speed;
    }

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void changeAltitude(float change) {
        this.altitude += change; // Change the altitude
    }

    @Override
    public float getAltitude() {
        return altitude;
    }
}