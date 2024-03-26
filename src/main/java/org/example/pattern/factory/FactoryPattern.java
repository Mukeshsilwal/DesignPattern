package org.example.pattern.factory;

import org.example.pattern.Employee;
import org.example.pattern.factory.employee.DotNetDeveloper;
import org.example.pattern.factory.employee.JavaDeveloper;

public class FactoryPattern {
    public static Employee getEmployee(String empType){
        if(empType.trim().equalsIgnoreCase("JAVADEVELOPER")){
            return new JavaDeveloper();
        }
        else if(empType.trim().equalsIgnoreCase("DOTNETDEVELOPER")){
            return new DotNetDeveloper();
        }
        else{
            return null;
        }
    }
}
