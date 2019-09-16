package com.enigma.model;

public class Heroes implements HitAble {

     Integer healthPoint   ;
     Integer mana ;
     Integer brustDamage ;


    public Heroes(Integer healthPoint, Integer mana, Integer brustDamage) {
        this.healthPoint = healthPoint;
        this.mana = mana;
        this.brustDamage = brustDamage;
    }

    public void attack(Heroes heroes){
     heroes.getHit(this.brustDamage);
     }

    @Override
    public void getHit(Integer demage) {
        this.healthPoint = healthPoint - demage;

    }



    public String print(){
        return "Heroes Stat{" +
                "Hp"+healthPoint+
                "mana"+mana+
                "Hit"+brustDamage;

    }



//    private final String M = "Mage";
//    private final String T = "Tank";
//    private final String MM = "Marksman";



//    public Heroes(String playerherotype,String enemyherotype){
//        this.playerherotype = playerherotype;
//        this.enemyherotype = enemyherotype;
//        return;
//          }
//
//    public Heroes() {
//
//    }
//
//    public Heroes(String playerherotype) {
//    }
//
//    public String setPlayerHeroType(String playerherotype){
//        if (playerherotype == "Mage"){
//            System.out.println("Hero Anda adalah Babi");
//        }
//        else  if (playerherotype == "Tank"){
//            System.out.println("Hero Anda adalah Babi");
//        }
//        else  if (playerherotype == "Marksman"){
//            System.out.println("Hero Anda adalah Babi");
//        }
//        return "";
//    }
//    String setHeroes(int health, int mana){
//
//        System.out.println("Hp Awal Anda = " +health);
//        System.out.println("Hp Awal Anda = " +mana);
//        return "";
//    }
//
//
//    public String heroesStatus(){
//        return "";
//        }
//


}

