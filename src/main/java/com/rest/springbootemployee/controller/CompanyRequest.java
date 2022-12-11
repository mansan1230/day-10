package com.rest.springbootemployee.controller;

public class CompanyRequest {


    public CompanyRequest(String name) {
        this.name = name;
    }
    public CompanyRequest() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

}
