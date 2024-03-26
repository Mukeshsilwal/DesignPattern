package org.example.pattern.abstract_design_pattern.developer;

import org.example.pattern.abstract_design_pattern.Employee;

public class JavaDeveloper implements Employee {
    @Override
    public int salary() {
        return 80000;
    }

    @Override
    public String name() {
        System.out.println("Hi I am a Java Developer");
        return "JAVA DEVELOPER";
    }
}
