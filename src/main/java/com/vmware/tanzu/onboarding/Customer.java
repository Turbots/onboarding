package com.vmware.tanzu.onboarding;

public class Customer {

    private String name;
    private String status;

    public Customer() {
    }

    public Customer(String name, String status) {
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }
}
