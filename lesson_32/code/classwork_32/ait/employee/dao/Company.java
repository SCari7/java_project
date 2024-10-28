package classwork_32.ait.employee.dao;

import classwork_32.ait.employee.model.Employee;

import java.util.function.Predicate;

public interface Company {

    boolean addEmployee(Employee employee);

    Employee removeEmployee(int id);

    Employee findEmployee (int id);

    Employee upDateEmployee(Employee employee);

    int quantity(); //size

    void printEmployee();

     double totalSalary();

     double totalSales();

     double averageSalary();

    Employee[] findEmployeeHoursGreaterThan (int hours);//айти сотрудников по переработке
    Employee[] findEmployeeSalaryRange(double minSalary, double maxSalary);

    Employee[] findEmployeeByPredicate(Predicate<Employee> predicate);
}
