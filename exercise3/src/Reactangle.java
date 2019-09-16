package com.enigma.model.;
public class Reactangle {
    protected Double length ;
    protected Double width ;

    public Reactangle(Double length, Double width){
        this.length = length;
        this.width = width;
    }
    Double getSurface(){
        return length*width;
    }
    Double getRound(){
        return 2*(length*width);
    }
    public String print(){
        return "Rectangle ("+
                "length = " +length+
                "width  = " +width+
                "round = " +getRound()+
                "surface" +getSurface()+
                ")";
    }
}
