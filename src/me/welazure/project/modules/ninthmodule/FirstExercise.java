package me.welazure.project.modules.ninthmodule;

import me.welazure.project.modules.ninthmodule.firstexercise.ContractEmployee;
import me.welazure.project.modules.ninthmodule.firstexercise.Employee;
import me.welazure.project.modules.ninthmodule.firstexercise.PermanentEmployee;
import static me.welazure.project.modules.Utils.*;

public class FirstExercise {
    public static void main(String[] args) {
        PermanentEmployee employee1 = new PermanentEmployee("Emplo", 1, 1000, 100);
        ContractEmployee employee2 = new ContractEmployee("Employee", 2, 100, 4);

        printInfo(employee1);
        printInfo(employee2);

        employee2.setHoursWorked(10);

        printInfo(employee2);
    }
    public static void printInfo(Employee employee) {
        print(String.format("Pay of %s %s with id %s is: %s",
                employee.getClass().getSimpleName(),
                employee.getName(),
                employee.getId(),
                employee.calculatePay()));
        if(employee instanceof ContractEmployee) {
            ContractEmployee contractEmployee = (ContractEmployee) employee;
            println(String.format(
                    ", Hours worked: %s",
                    contractEmployee.getHoursWorked()
            ));
        } else {
            println("");
        }
    }
}
