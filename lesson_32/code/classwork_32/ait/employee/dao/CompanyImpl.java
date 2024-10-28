package classwork_32.ait.employee.dao;

import classwork_32.ait.employee.model.Employee;
import classwork_32.ait.employee.model.SalesManager;

import java.util.Arrays;
import java.util.function.Predicate;

public class CompanyImpl implements Company {


    private Employee[] employees;
    private int size;

    //capacity потому что не известно сколько людей в компании
    public CompanyImpl(int capacity) {
        this.employees = new Employee[capacity];
        this.size = size;
    }


    @Override
    public boolean addEmployee(Employee employee) {
        //bad cases
        if (employee == null) {
            return false;
        }
        if (size == employees.length) {
            return false;
        }
//        if (findEmployee(employee.getId()).equals(employee)){
//            return false;
//        }
        if (!(findEmployee(employee.getId()) == null)) {
            //Dublicate
            return false;
        }
        //gut cases
        employees[size] = employee;
        size++;
        return true;
    }

    @Override
    public Employee removeEmployee(int id) {
//        Employee victim = findEmployee(id);
//
//        //а место жертвы копируем последний элемент
//        employees[victim.getId()] = employees[size -1];
//        //последний элемент затрем с помощью null
//        employees[size - 1]
        for (int i = 0; i < size; i++) {
            if (employees[i].getId() == id) {
                Employee victim = employees[i];
//                employees[i] = employees[size - 1];
//                employees[size - 1] = null;
//                size--;
                System.arraycopy(employees, i + 1, employees, i, size  -i -1);//берем с 1 позиции копируем и вставляем на место -i-1
                employees[--size] = null;//префиксные работы?
                return victim;

            }

        }
        return null;
    }

    @Override
    public Employee findEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getId() == id) {
                return employees[i];
            }

        }
        return null;
    }

    @Override
    public Employee upDateEmployee(Employee employee) {
        //отыскать нужного в массиве и обновить поля, забирая их getter из employee
        for (int i = 0; i < size; i++) {
            if (employees[i].getId() == employee.getId()){
//                employees[i].setSecondName(employee.getSecondName());
//                employees[i].setHours(employee.getHours());
                employees[i] = employee;//заменяет 2 верхних
                return employees[i];
            }
        }

        return null;
    }

    @Override
    public int quantity() {
        return size;
    }

    @Override
    public void printEmployee() {
        for (int i = 0; i < size; i++) {//пройти
            System.out.println(employees[i]);//текущий элемент массива это [i]
        }

    }

    @Override
    public double totalSalary() {
        double totalSalary = 0;
        for (int i = 0; i < size; i++) {
            totalSalary += employees[i].calcSalary();
        }

        return totalSalary;
    }

    @Override
    public double totalSales() {
        double totalSales = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i] instanceof SalesManager) {// проверка перед кастингом
                SalesManager sm = (SalesManager) employees[i];
                totalSales += sm.getSalesValue();
            }

        }
        return totalSales;
    }

    @Override
    public double averageSalary() {
        if (size == 0) {
            return 0;
        }
        double totalSalary = 0;
        for (int i = 0; i < size; i++) {
            totalSalary += employees[i].calcSalary();
        }
        return totalSalary / size;
    }

//    @Override
//    public Employee[] findEmployeeHoursGreaterThan(int hours) {
//        int count = 0;
//        for (int i = 0; i < size; i++) {
//            if (employees[i].getHours()> hours){
//                count++;
//            }
//
//        }
//
//        Employee[] res = new Employee[count];
//        for (int i = 0, j = 0; j < res.length; i++) {
//            if(employees[i].getHours()>hours){
//                res[j++] = employees[i];
//            }
//        }
//        return res;
//    }
    @Override
    public Employee[] findEmployeeHoursGreaterThan(int hours){
        return findEmployeeByPredicate(e -> e.getHours()> hours);
    }
    @Override
    public Employee[] findEmployeeSalaryRange(double minSalary, double maxSalary){
        return findEmployeeByPredicate(e -> e.calcSalary() > minSalary && e.calcSalary()< maxSalary);
    }


    public Employee[] findEmployeeByPredicate(Predicate<Employee> predicate) {

        Employee[] res = new Employee[size];
        int j = 0; //это индексы массива результатов

        // читаем массив и перекладываем рез-ты в новый
        for (int i = 0; i < size; i++) {
            if(predicate.test(employees[i])){
                res[j++] = employees[i];
            }


        }
        return Arrays.copyOf(res, j);
    }
}
