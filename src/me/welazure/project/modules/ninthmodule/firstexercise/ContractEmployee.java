package me.welazure.project.modules.ninthmodule.firstexercise;

public class ContractEmployee extends Employee implements Payable{
    private int hoursWorked;

    public ContractEmployee(String name, long id, double payPerHour) {
        super(name, id, payPerHour);
    }
    public ContractEmployee(String name, long id, double payPerHour, int hoursWorked) {
        this(name, id, payPerHour);
        this.hoursWorked = hoursWorked;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }
    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    @Override
    public double calculatePay() {
        return getSalary() * hoursWorked;
    }
}
