package com.galvanize.company;

import org.springframework.data.annotation.Id;

/**
 * Created by localadmin on 02/06/2016.
 */
public class Company {
    @Id
    private String Id;
    private final String name;
    private final int numberOfEmployees;

    public Company(String name, int numberOfEmployees) {
        this.name = name;
        this.numberOfEmployees = numberOfEmployees;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }
}
