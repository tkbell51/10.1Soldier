package com.company.Classes;

/**
 * Created by TKB on 7/24/17.
 */
public class McCree extends FootSoldier {

    public McCree(String name, String rank, int serialNumber, String weapon) {
        super(name, rank, serialNumber, weapon);
    }

    public void speak() {
        System.out.println("Justice ain't gonna dispense itself.");
    }


    public void attack() {
        System.out.println("It's high noon.");
    }
}
