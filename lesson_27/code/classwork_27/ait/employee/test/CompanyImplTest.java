package classwork_27.ait.employee.test;

import classwork_27.ait.employee.dao.Company;
import classwork_27.ait.employee.dao.CompanyImpl;
import classwork_27.ait.employee.model.Employee;
import classwork_27.ait.employee.model.Manager;
import classwork_27.ait.employee.model.SalesManager;
import classwork_27.ait.employee.model.Worker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanyImplTest {

    Company company;
    Employee[] emp;


    @BeforeEach
    void setUp() {
        //создаем объект
        company = new CompanyImpl(5);
        // fill array to fill object company
        emp = new Employee[4];
        emp[0] = new Manager(1, "N1", "L1", 160, 5000, 25);
        emp[1] = new SalesManager(2, "N2", "L2", 170, 50000, 0.1);
        emp[2] = new SalesManager(3, "N3", "L3", 165, 80000, 0.15);
        emp[3] = new Worker(4, "N4", "L4", 160, 20);
        //TODO поместить объекты emp [] в объекты company с помощью addEmployee

        for (int i = 0; i < 4; i++) {
            company.addEmployee(emp[i]);

        }

    }

    @Test
    void addEmployeeTest() {
        assertEquals(4, company.quantity());
        //can't add null
        assertFalse(company.addEmployee(null));
        //can't add duplicate
        assertFalse(company.addEmployee(emp[2]));
        //can add new employee
        Employee newEmp = new Worker(5, "N5", "L5", 160, 20);
        assertTrue(company.addEmployee(newEmp));
        //check size
        assertEquals(5, company.quantity());

        //can't add one more employee
        Employee oneMoreEmp = new Worker(6, "N6", "L6", 160, 20);

        assertFalse(company.addEmployee(oneMoreEmp));


    }


    @Test
    void removeEmployeeTest() {
        //can remove existed
        assertEquals(emp[1], company.removeEmployee(2));
        assertEquals(3, company.quantity());//печат всех елементов
        assertNull(company.removeEmployee(7));

    }

    @Test
    void findEmployeeTest() {
        assertEquals(emp[2], company.findEmployee(3));//Ищем существующего работника
        assertNull(company.findEmployee(7));

    }

    @Test
    void upDateEmployeeTest() {


    }

    @Test
    void quantityTest() {
        assertEquals(4, company.quantity());


    }

    @Test
    void printEmployeeTest() {
        company.printEmployee();//печать метода 1 шаг //методы типа войд/void не проверяются с помощью асерт/assert

    }
    @Test
    void averageSalary(){
        double averageSalary = 7300;
        assertEquals(averageSalary,company.averageSalary());
    }

    @Test
    void totalSalaryTest() {

        double totalSalary = 29200;//predpologenie
        assertEquals(totalSalary,company.totalSalary());

    }

    @Test
    void totalSalesTest() {

        assertEquals(130000,company.totalSales());

    }

    @Test
    void findEmployeeHoursGreaterThanTest() {
        Employee[] expected = {emp[1], emp[2]};
        Employee[] actual = company.findEmployeeHoursGreaterThan(160);
        assertArrayEquals(expected, actual);


    }

    @Test
    void findEmployeeSalaryRangeTest() {


        //Employee[] findEmployeeSalaryRange = new Employee[]{emp[1], emp[2]};
        Employee[] expected = {emp[0], emp[1], emp[3]};
        Employee[] actual = company.findEmployeeSalaryRange(3000, 10000);
        assertArrayEquals(expected, actual);


    }

}