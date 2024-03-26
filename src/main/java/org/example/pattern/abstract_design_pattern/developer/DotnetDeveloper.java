package org.example.pattern.abstract_design_pattern.developer;

import org.example.pattern.abstract_design_pattern.Employee;

public class DotnetDeveloper implements Employee {
    @Override
    public int salary() {
        return 70000;
    }

    @Override
    public String name() {
        System.out.println("Hi I am a Dot net developer");
        return "DOTNET DEVELOPER";
    }
}
