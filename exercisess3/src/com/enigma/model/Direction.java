package com.enigma.model;

public enum Direction {
    NORTH,
    WEST,
    SOUTH,
    EAST;

    Direction turnLeft(Direction direction ){
        return Direction.EAST;

    }

}
