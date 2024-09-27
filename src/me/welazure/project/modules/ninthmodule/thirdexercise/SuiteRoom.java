package me.welazure.project.modules.ninthmodule.thirdexercise;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SuiteRoom extends Room implements Serviceable{
    Map<String, Double> services = new HashMap<>();

    public SuiteRoom(int roomNumber, String roomType, double pricePerNight) {
        super(roomNumber, roomType, pricePerNight);
    }
    public SuiteRoom(int roomNumber, double pricePerNight) {
        super(roomNumber, "Suite Room", pricePerNight);
    }

    @Override
    public void addService(String serviceName, double servicePrice) {
        services.put(serviceName, servicePrice);
    }
    @Override
    public String[] getServices() {
        return services.keySet().toArray(new String[services.size()]);
    }
    @Override
    public double getServiceFee(String serviceName) {
        return services.get(serviceName);
    }
    @Override
    public double getTotalServiceFee() {
        return services.values().stream().reduce(0.0, Double::sum);
    }

}
