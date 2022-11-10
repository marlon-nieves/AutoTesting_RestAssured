package Dummy.Employye.request.Builder;

import Dummy.Employye.request.EmployeeRequest;
import model.User.Request.Builder.UserRequestBuilder;
import model.User.Request.UserRequest;


public class Build {
    public EmployeeRequestBuilder employeeRequestBuilder;
    public void setEmployeeRequestBuilder (EmployeeRequestBuilder employee){
        employeeRequestBuilder=employee;
    }
    public EmployeeRequest getEmployeeRequest(){
        return employeeRequestBuilder.getEmployee();
    }

    public  void buildEmployeeRequest(){
        employeeRequestBuilder.Buildage();
        employeeRequestBuilder.Buildsalary();
        employeeRequestBuilder.Buildname();

    }
}
