package com.examples.oop.example.western;

public class Gunfight {
    public static void main(String[] args) {

        WesternTown sweatyPost = new WesternTown();
            sweatyPost.saloons = 2;
            sweatyPost.sheriffs = 1;
            sweatyPost.troublemakers = 5;

        Villains maurice = new Villains();
            maurice.hatColor = "black";
            maurice.mustacheColor = "red";
            maurice.sex = "Male";
            maurice.horseName = "Beer Gut";
            maurice.whiskeyPreference = "Jack daniels";

        Humans katy = new Humans();
            katy.sex = "female";
            katy.horseName = "Midnight";
            katy.whiskeyPreference = "Straight";
            katy.name = "Katy";

        maurice.drinkWhiskey();
        System.out.println(maurice.howDrunkAml());
        maurice.tieUpDamsel(katy);
    }
}
