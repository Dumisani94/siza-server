package com.siza.enums;

public enum UserStatus {
    IN_PROGRESS("In Progress"),
    SUSPENDED("Suspended"),
    REJECTED("Rejected"),
    APPROVED("Approved");

    private final String label;

    UserStatus(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    // Safe parsing
    public static UserStatus from(String value) {
        return UserStatus.valueOf(value.toUpperCase());
    }

    // Java 17 switch expression
    public String getColor() {
        return switch (this) {
            case IN_PROGRESS -> "blue";
            case APPROVED -> "green";
            case REJECTED -> "red";
            case SUSPENDED -> "orange";
        };
    }
}
