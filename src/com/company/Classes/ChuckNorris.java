package com.company.Classes;

/**
 * Created by TKB on 7/24/17.
 */
public class ChuckNorris extends FootSoldier {


    public ChuckNorris(String name, String rank, int serialNumber, String weapon) {
        super(name, rank, serialNumber, weapon);
    }

    public void speak() {
        System.out.println("I don't initiate violence, I retaliate.");
    }


    public void attack() {
        System.out.println("Chuck Norris doesn't have good aim. His bullets just know better than to miss.");
    }
}
