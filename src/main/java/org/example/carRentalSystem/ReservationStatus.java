package org.example.carRentalSystem;

public enum ReservationStatus {

    SCHEDULED("SCHEDULED"),
    INPROGRESS("INPROGRESS"),
    COMPLETED("COMPLETED"),
    CANCELLED("CANCELLED");

    private String value;

    ReservationStatus(String value) {
        this.value = value;
    }

    public static ReservationStatus fromValue(String value) {

        for(ReservationStatus type : ReservationStatus.values()) {
            if(type.value.equalsIgnoreCase(value)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknow value " + value);
    }
}
