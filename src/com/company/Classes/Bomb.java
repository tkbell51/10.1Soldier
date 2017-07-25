package com.company.Classes;

import com.company.Interfaces.IBomb;

/**
 * Created by TKB on 7/24/17.
 */
public class Bomb extends Soldier implements IBomb {

    public Bomb(String name, String rank, int serialNumber) {
        super(name, rank, serialNumber);
    }

    public void speak() {

    }

    public void attack() {

    }


    public String toString() {
        return "Bomb{" +
                "name='" + name + '\'' +
                ", rank='" + rank + '\'' +
                ", SerialNumber=" + SerialNumber +
                "} " + super.toString();
    }

    public Bomb makeBomb() {
        System.out.println("BOMB EXPLOOOOSION");
        return null;
    }
}
