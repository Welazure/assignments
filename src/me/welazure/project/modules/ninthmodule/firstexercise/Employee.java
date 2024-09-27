package me.welazure.project.modules.ninthmodule.firstexercise;

public abstract class Employee implements Payable{
    private String name;
    private long id;
    private double salary;
    public Employee(String name, long id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }
    public double getSalary() {
        return salary;
    }
    @Override
    public abstract double calculatePay();
}
