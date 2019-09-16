package com.enigma.model;

public enum Directions {
    NORTH,
    EAST,
    WEST,
    SOUTH;

    Directions turnLeft() {
        return Directions.values()[(ordinal() + 3) % 4];
    }
    Directions turnRight(){
        return Directions.values()[(ordinal()+1)%4];

    }

}
