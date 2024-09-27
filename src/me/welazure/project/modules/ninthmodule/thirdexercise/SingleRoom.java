package me.welazure.project.modules.ninthmodule.thirdexercise;

public class SingleRoom  extends Room {

    public SingleRoom(int roomNumber, String roomType, double pricePerNight) {
        super(roomNumber, roomType, pricePerNight);
    }
    @Override
    public void addService(String serviceName, double servicePrice) {

    }
    @Override
    public String[] getServices() {
        return new String[0];
    }
    @Override
    public double getServiceFee(String serviceName) {
        return 0d;
    }
    @Override
    public double getTotalServiceFee() {
        return 0d;
    }
}
