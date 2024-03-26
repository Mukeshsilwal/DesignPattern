package org.example;

import org.example.pattern.Employee;
import org.example.pattern.abstract_design_pattern.EmployeeFactory;
import org.example.pattern.abstract_design_pattern.abstract_employee.employee.AbstractEmployeeForJava;
import org.example.pattern.singleton.Samosa;
import org.example.pattern.factory.FactoryPattern;

public class Main {
    public static void main(String[] args) {
        Samosa samosa=Samosa.getSamosa();
        Samosa samosa1=Samosa.getSamosa();

        System.out.println("Samosa 1:"+samosa);
        System.out.println("Samosa 2:"+samosa1);

        Employee employee =FactoryPattern.getEmployee("JAVADEVELOPER");
        int salary=employee.salary();
        System.out.println("Java Developer salary :"+salary);

        Employee employee1 =FactoryPattern.getEmployee("DOTNETDEVELOPER");
        int salary1=employee1.salary();
        System.out.println("Dotnet Developer salary :"+salary1);


        EmployeeFactory employee2=new EmployeeFactory();
       org.example.pattern.abstract_design_pattern.Employee employee3 = employee2.getEmployee(new AbstractEmployeeForJava());
        employee3.name();
        int salary3= employee3.salary();
        System.out.println("My salary is :"+salary3);


    }
}