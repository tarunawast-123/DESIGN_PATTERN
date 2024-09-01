package org.example.tictactoe.Model;

public enum PieceType {
    X("X"),
    O("O");

    private String value;

    private PieceType(String value) {
        this.value = value;
    }

    public PieceType fromValue(String value) {

        for(PieceType type : PieceType.values()) {
            if(type.value.equalsIgnoreCase(value)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid piece type");
    }
}
