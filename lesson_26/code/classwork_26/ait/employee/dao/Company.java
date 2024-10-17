package classwork_26.ait.employee.dao;

import classwork_26.ait.employee.model.Employee;

public interface Company {

    boolean addEmployee(Employee employee);

    Employee removeEmployee(int id);

    Employee findEmployee (int id);

    Employee upDateEmployee(Employee employee);

    int quantity(); //size

    void printEmployee();

     double totalSalary();

     double totalSales();

    Employee[] findEmployeeHoursGreaterThan (int hours);//айти сотрудников по переработке
    Employee[] findEmployeeSalaryRange(double minSalary, double maxSalary);
}
