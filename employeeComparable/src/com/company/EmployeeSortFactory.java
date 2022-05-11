package com.company;

import java.util.Comparator;

public class EmployeeSortFactory {
    public Comparator<Employee> buildComparator(int parameterSort) {
        switch (parameterSort) {
            case 1:
                return new NameComparator();
            case 2:
                return new AgeComparator();
            case 3:
                return new SalaryComparator();
            case 4:
                return new AgeNameComparator();
        }
        return null;
    }
}
