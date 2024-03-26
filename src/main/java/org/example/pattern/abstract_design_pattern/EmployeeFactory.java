package org.example.pattern.abstract_design_pattern;

import org.example.pattern.abstract_design_pattern.abstract_employee.AbstractEmployeeFactory;

public class EmployeeFactory {

    public Employee getEmployee(AbstractEmployeeFactory factory){
        return factory.createEmployee();
    }
}
