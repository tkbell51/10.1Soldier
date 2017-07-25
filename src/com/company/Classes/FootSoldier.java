package com.company.Classes;

import com.company.Interfaces.IFootSoldier;

/**
 * Created by TKB on 7/24/17.
 */
public class FootSoldier extends Soldier implements IFootSoldier {

    private String weapon;

    public FootSoldier(String name, String rank, int serialNumber, String weapon) {
        super(name, rank, serialNumber);
        this.weapon = weapon;
    }

    public void speak() {
        System.out.println("We're all soldiers now.");
    }

    public void attack() {
        System.out.println("caboom!!");
    }
}
