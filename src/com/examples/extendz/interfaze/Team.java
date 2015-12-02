package com.examples.extendz.interfaze;

public class Team implements BasketballTeam, FootballTeam {
    private String name = null;

    public Team(String name) {
        this.name = name;
    }

    @Override
    public void printBasketballName() {
        System.out.println("Basketball Team: \"" + name + " B.C.\"");
    }

    @Override
    public void printFootballName() {
        System.out.println("Football Team: \"" + name + " F.C.\"");
    }

    public static void main(String[] args) {
        Team t = new Team("Team A");
        t.printBasketballName();
        t.printFootballName();
    }
}
