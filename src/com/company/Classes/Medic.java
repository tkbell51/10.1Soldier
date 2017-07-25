package com.company.Classes;

/**
 * Created by TKB on 7/24/17.
 */
public class Medic extends FootSoldier {

    public Medic(String name, String rank, int serialNumber, String weapon) {
        super(name, rank, serialNumber, weapon);
    }

    public void speak() {
        System.out.println("Heroes Never Die!");
    }


    public void attack() {
        System.out.println("My reticule is 3xs larger \n but I do the least amount of damage \n pew, pew, pew");
    }

}
