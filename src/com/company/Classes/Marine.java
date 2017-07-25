package com.company.Classes;

/**
 * Created by TKB on 7/24/17.
 */
public class Marine extends FootSoldier{
    private String formColors;

    public Marine(String name, String rank, int serialNumber, String weapon, String formColors) {
        super(name, rank, serialNumber, weapon);
        this.formColors = formColors;
    }

    public void speak() {
        System.out.println("oohrah");
    }


    public void attack() {
        System.out.println("EXPLOOOOOOSIONNNNS!");
    }
}
