package com.theironyard.novauc;

/**
 * Created by ANVIL_OCTOPUS on 2/7/17.
 */
public class ford {
    String type;
    String drive;
    int doors;
    String fuel;
    int passengers;

    public ford(String type, String drive, int doors, String fuel, int passengers) {
        this.type = type;
        this.drive = drive;
        this.doors = doors;
        this.fuel = fuel;
        this.passengers = passengers;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDrive() {
        return drive;
    }

    public void setDrive(String drive) {
        this.drive = drive;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
}
