package org.example.pattern.abstract_design_pattern.abstract_employee.employee;

import org.example.pattern.abstract_design_pattern.Employee;
import org.example.pattern.abstract_design_pattern.abstract_employee.AbstractEmployeeFactory;
import org.example.pattern.abstract_design_pattern.developer.JavaDeveloper;

public class AbstractEmployeeForJava extends AbstractEmployeeFactory {
    @Override
    public Employee createEmployee() {
        return new JavaDeveloper();
    }
}
