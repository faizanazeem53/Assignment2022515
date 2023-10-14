/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author Faizan
 */
// Drivable interface implementation
public class Car extends Vehicle implements Drivable {
    public Car(String make, String type) {
        this.make = make;
        this.type = type;
        this.numWheels = 4;
        this.numPassengers = 5;
    }

    @Override
    public void accelerate(float speed) {
        this.speed += speed; // Increase the speed
    }

    @Override
    public void brake() {
        this.speed = 0; // Stop the car
    }

    @Override
    public void turn(float angle) {
        this.direction += angle; // Turn the car
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
}