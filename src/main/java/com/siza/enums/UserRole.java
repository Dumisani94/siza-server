package com.siza.enums;

public enum UserRole {

    ADMIN("Admin"),
    SERVICE_PROVIDER("Service Provider"),
    CUSTOMER("Customer");

    private final String label;

    UserRole(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

}
