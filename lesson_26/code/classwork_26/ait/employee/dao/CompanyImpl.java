package classwork_26.ait.employee.dao;

import classwork_26.ait.employee.model.Employee;

public class CompanyImpl implements Company {


    private  Employee[] employees;
    private int size;
//capacity потому что не известно сколько людей в компании
    public CompanyImpl(int capacity) {
        this.employees = new  Employee[capacity];
        this.size = size;
    }



    @Override
    public boolean addEmployee(Employee employee) {
        return false;
    }

    @Override
    public Employee removeEmployee(int id) {
        return null;
    }

    @Override
    public Employee findEmployee(int id) {
        return null;
    }

    @Override
    public Employee upDateEmployee(Employee employee) {
        return null;
    }

    @Override
    public int quantity() {
        return 0;
    }

    @Override
    public void printEmployee() {

    }

    @Override
    public double totalSalary() {
        return 0;
    }

    @Override
    public double totalSales() {
        return 0;
    }

    @Override
    public Employee[] findEmployeeHoursGreaterThan(int hours) {
        return new Employee[0];
    }

    @Override
    public Employee[] findEmployeeSalaryRange(double minSalary, double maxSalary) {
        return new Employee[0];
    }
}
