package com.company;

import com.company.Classes.*;

public class Main {

    public static void main(String[] args) {
        FootSoldier soldierOne = new FootSoldier("Dan", "Lieutenant", 5543, "AK-47");
        soldierOne.attack();
        soldierOne.speak();

        Medic newMedic = new Medic("Jim", "private", 1432, "shotgun");
        newMedic.attack();
        newMedic.speak();

        ChuckNorris chuckNorris = new ChuckNorris("Chuck Norris", "Chuck Norris", 1, "Chuck Norris");
        chuckNorris.attack();
        chuckNorris.speak();

        McCree mcCree = new McCree("McCree", "Bounty Hunter", 200, "PeaceKeeper");
        mcCree.attack();
        mcCree.speak();

        Marine newMarine = new Marine("G. I. Joe", "Major", 3540, "This is my rifle", "scarlet and gold");
        newMarine.attack();
        newMarine.speak();

Bomb newBomb = new Bomb("Kaboom", "fire", 24);
newBomb.toString();
    newBomb.makeBomb();

    }
}
