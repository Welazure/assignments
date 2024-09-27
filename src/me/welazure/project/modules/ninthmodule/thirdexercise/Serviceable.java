package me.welazure.project.modules.ninthmodule.thirdexercise;

public interface Serviceable {
    void addService(String serviceName, double serviceFee);
    String[] getServices();
    double getServiceFee(String serviceName);
    double getTotalServiceFee();
}
