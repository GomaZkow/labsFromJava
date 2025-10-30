package laba6_zad2;

import java.util.List;
import java.util.ArrayList;

public class Planet {
    private String name;
    private List<Moon> moons;

    public Planet(String name) {
        this.name = name;
        this.moons = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addMoon(Moon moon) {
        moons.add(moon);
    }

    public List<Moon> getMoons() {
        return moons;
    }
}
