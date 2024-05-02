package org.example.carRentalSystem.product;

public enum VehicleStatus {

    ACTIVE("ACTIVE"),
    INACTIVE("INACTIVE");

    private String value;
    VehicleStatus(String value) {
      this.value = value;
    }
    public static VehicleStatus fromValue(String value) {

        for(VehicleStatus type : values()) {
            if(type.value.equalsIgnoreCase(value)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid value " + value);
    }
}
