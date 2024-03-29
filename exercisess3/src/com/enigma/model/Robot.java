package com.enigma.model;

import com.sun.javafx.scene.traversal.Direction;
import javafx.scene.shape.Circle;

public class Robot {


        private Integer postX;
        private Integer postY;
        private Integer fuel = 0;
        private final String F = "F";
        private final String B = "B";
        private final String R = "R";
        private final String L = "L";
        private char [] commands ;
        Direction direction;
        Circle whells;

        public Robot(Integer x, Integer y, Direction direction){
            this.postX = x ;
            this.postY = y ;
            this.direction = direction;
        }

//        public turnLeft(){
//            return this.direction = Direction.LEFT ;
//        }


        public Integer fillFuel(int fuel) {
            this.fuel = this.fuel + fuel;
            return fuel;
        }

        public void command(String commands){
            this.commands = commands.toCharArray();

        }

        private String move(String movement){
            if (movement.equals("F")){
                this.postY++;
            }
            else if (movement.equals("B")){
                this.postY--;
            }
            else if (movement.equals("L")){
                this.postX++;
            }
            else if (movement.equals("R")){
                this.postX--;
            }
            return movement;
        }

        public String run(){
            for (int i = 0; i<this.commands.length; i++){
                if(fuel==0){
                    System.out.println("Mobil Mogok");
                    break;
                }
                move(String.valueOf(this.commands[i]));
                System.out.println(this.commands[i] + getPosition());
                if ((i+1)%3==0){
                    fuel--;
                }
            }
            return "";
        }
        public String getPosition(){
            return "("+postX+","+postY+")";
        }

        public String print(){
            return "Mobil{"
                    +"X = "+postX+" ,Y = "+postY+", " +
                    "Bahan Bakar Anda = "+fuel+"" +
                    "Anda Berada di"+run()+"}";
        }

    }

