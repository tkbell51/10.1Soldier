package com.company.Classes;

/**
 * Created by TKB on 7/24/17.
 */
public abstract class Soldier {
    protected String name;
    protected String rank;
    protected int SerialNumber;

    public Soldier(String name, String rank, int serialNumber) {
        this.name = name;
        this.rank = rank;
        SerialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public String getRank() {
        return rank;
    }

    public int getSerialNumber() {
        return SerialNumber;
    }

    public void eat(){
        System.out.println("chew, chew, chew");
    }

    public void sleep(){
        System.out.println("snore, zzzz, snore");
    }

    public void walk(){
        System.out.println("LEFT!!!!, LEFT!!!!, LEFT, RIGHT");
    }

}
