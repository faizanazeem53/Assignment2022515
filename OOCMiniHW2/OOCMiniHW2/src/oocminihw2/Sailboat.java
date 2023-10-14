/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author Faizan
 */
// Sailable interface implementation
public class Sailboat extends Vehicle implements Sailable {
    private boolean sailHoisted = false;

    public Sailboat(String make, String type) {
        this.make = make;
        this.type = type;
        this.numSails = 1;
        this.numPassengers = 4;
    }

    @Override
    public void hoistSail() {
        sailHoisted = true;
    }

    @Override
    public void lowerSail() {
        sailHoisted = false;
    }

    @Override
    public boolean isSailHoisted() {
        return sailHoisted;
    }

    @Override
    public void landHo() {
        // Implement sailing actions
    }
}