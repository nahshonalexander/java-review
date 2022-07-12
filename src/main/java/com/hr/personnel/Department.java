package com.hr.personnel;

public class Department {

    private String name;
    private String location;
    private Employee[] employees = new Employee[100];
    private int currentIndex;


    public Department(String name, String location) {
        this.name = name;
        this.location = location;
    }


    public void addEmployee(Employee employee){

        employees[currentIndex++] = employee; //adds an employee the employee array. you dont need a for loopp


    }

    public int getCurrentIndex() {
        return currentIndex;
    }

    public int letEmployeesWorkandReturnNumberOfEmployeesWhoWorked(){
        int employeeWhoWorked = 0;

        //for(Employee employee: employees){
        for (int i = 0; i < currentIndex; i++) {
            String work = employees[i].work();
            if(work.contains("worked")){
                employeeWhoWorked++;

        }

        }

        return employeeWhoWorked;
    }

    public Employee[] getEmployee() {
        return employees;
    }

    public double computeDepartmentMonthlyTotalCompensation(Employee employee){


        return employee.getComputeMontlyCompensation();
    }
}
