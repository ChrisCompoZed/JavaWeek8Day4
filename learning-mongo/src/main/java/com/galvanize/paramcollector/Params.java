package com.galvanize.paramcollector;

import org.springframework.data.annotation.Id;
/**
 * Created by localadmin on 02/06/2016.
 */
public class Params {

    @Id
    private String Id;
    private final String name;

    public Params(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}