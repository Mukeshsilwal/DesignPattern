package org.example;

import org.example.pattern.Employee;
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


    }
}