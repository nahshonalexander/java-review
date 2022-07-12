package com.hr.personnel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class DepartmentTest {

    Department department;

    @Before
    public void setUp() {
        department = new Department("marketing", "building2");
        employee = new SalariedEmployee("Shon", LocalDate.of(2022, 7,11), 3000);
        employee = new HourlyEmployee("Shon", LocalDate.of(2022, 7 , 1),
                7, 15);
    }

    @Test
    public void addEmployee_should_add_an_employee_correctly() {
        Department department = new Department("marketing", "building2");
        SalariedEmployee jane = new SalariedEmployee("jane",
                LocalDate.of(2022, 12, 1), 7000.0);
        department.addEmployee(jane);
        department.getEmployee();
        Employee[] employees = department.getEmployee();
        Assert.assertEquals(jane, employees[0]);




    }

    @Test
    public void letEmployeesWorkandReturnNumberOfEmployeesWhoWorked() {
    }


    @Test
    public void addEmployee_should_add_an_employee_correctly2() {
        int currentIndex = department.getCurrentIndex();


        SalariedEmployee jane1 = new SalariedEmployee("jane",
                LocalDate.of(2020,2,2));
        department.addEmployee(jane1);


        int currentIndextAfterAddingANewEmployee  = department.getCurrentIndex();
        assertEquals(currentIndex+1, currentIndextAfterAddingANewEmployee);

        //the current index was 0 and then when we added Jane1 it added 1.. which is why we did currentIndex+1
    }

    private Employee employee;


    @Test
    public void testGetEmployeeInfo_should_return_name_and_hireDate() {
        String employeeInfo = employee.getEmployeeInfo();
        assertEquals("name= Shon hiredate= 2022-07-11", employeeInfo);
    }

    @Test
    public void testWork_should_return_name_worked_string() {
        String work = employee.work();
        Assert.assertEquals("Shon worked", work);
    }
}
