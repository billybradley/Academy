package com.enigma.model;

public class Tower implements HitAble {
    Integer healthPoint ;

    public Tower(Integer healthPoint){
        this.healthPoint = healthPoint;
    }

    @Override
    public void getHit(Integer demage) {

    }

    @Override
    public void hitter(Integer mana) {

    }
}
