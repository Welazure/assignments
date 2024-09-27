package me.welazure.project.modules.thirdmodule;

public class Employee {
    private long employeeID;
    private String employeeName;
    private double salary;

    public Employee(long employeeID, String employeeName, double salary) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    /**
     * Gets the Employee ID
     *
     * @return Employee ID
     */
    public long getEmployeeID() {
        return employeeID;
    }

    /**
     *  Sets the Employee ID
     *
     * @param employeeID Employee ID to set
     */
    public void setEmployeeID(long employeeID) {
        this.employeeID = employeeID;
    }

    /**
     * Gets the employee Name
     *
     * @return Employee Name
     */
    public String getEmployeeName() {
        return employeeName;
    }


    /**
     * Sets the Employee Name
     *
     * @param employeeName Employee Name to Set
     */
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    /**
     * Gets the salary
     *
     * @return Salary of Employee
     */
    public double getSalary() {
        return salary;
    }


    /**
     * Sets the salary of the employee
     *
     * @param salary Salary to set to
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }


    /**
     * @param multiplier Multipler in int (ex. 10 = 10% multiplier)
     *
     * @return the Bonus salary
     */
    public double getBonusSalary(int multiplier) {
        return Math.floor(salary * multiplier/100);
    }

    /**
     *
     * @param multiplier Multiplier in int (ex. 10 = 110% salary)
     *
     * @return the Salary with an added bonus of said multiplier.
     */
    public double getTotalBonusSalary(int multiplier) {
        return salary + Math.floor(salary * multiplier*100);
    }
}