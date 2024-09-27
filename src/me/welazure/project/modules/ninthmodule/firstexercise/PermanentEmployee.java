package me.welazure.project.modules.ninthmodule.firstexercise;

public class PermanentEmployee extends Employee implements Payable{
    private double healthAllowance;


    public PermanentEmployee(String name, long id, double pay, double healthAllowance) {
        super(name, id, pay);
        this.healthAllowance = healthAllowance;
    }

    @Override
    public double calculatePay() {
        return getSalary() + healthAllowance;
    }
}
