package me.welazure.project.modules.ninthmodule.thirdexercise;

import java.util.HashMap;
import java.util.Map;

public abstract class Room implements Serviceable {
    private int roomNumber;
    private String roomType;
    private double pricePerNight;

    public Room(int roomNumber, String roomType, double pricePerNight) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
    }
    public int getRoomNumber() {
        return roomNumber;
    }
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
    public String getRoomType() {
        return roomType;
    }
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }
    public double getPricePerNight() {
        return pricePerNight;
    }
    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public double getTotalPrice(int nights) {
        double toReturn;
        toReturn = getTotalServiceFee() + (getPricePerNight() * nights);

        return toReturn;
    }

    @Override
    public abstract void addService(String serviceName, double servicePrice) ;
    @Override
    public abstract String[] getServices();
    @Override
    public abstract double getServiceFee(String serviceName);
    @Override
    public abstract double getTotalServiceFee();

}
