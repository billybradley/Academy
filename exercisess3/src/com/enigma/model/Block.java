package com.enigma.model;

public class Block extends Rectangle {

    private Double height;


    public Double getVolume(){
        return this.length=this.width*this.height;
    }
    public Block(Double length, Double width){
        super(width,length);
        this.height=height;
    }

    public Double getSurface(){
        return 2*(this.length=this.width)+
                2*(this.length=this.height)+
                2*(this.width=this.height);
    }
    public String print(){
        return "Block {lenght = "+this.length+
                ", Width = "+this.width+
                ", Height = "+this.height+
                ", Suerface = "+getSurface()+
                ", Volume = "+getVolume();
    }
}
