package org.example.carRentalSystem;

public enum ReservationType {

    HOURLY("HOURLY"),
    DAILY("DAILY");

    private String value;

    ReservationType(String value) {
        this.value = value;
    }

    public static ReservationType get(String value) {

        for(ReservationType type : ReservationType.values()) {
            if(type.value.equalsIgnoreCase(value)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

}
