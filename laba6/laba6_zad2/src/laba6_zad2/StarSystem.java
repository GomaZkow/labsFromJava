package laba6_zad2;
import java.util.ArrayList;
import java.util.List;

public class StarSystem {
    private Star star;
    private List<Planet> planets;

    public StarSystem(Star star) {
        this.star = star;
        this.planets = new ArrayList<>();
    }

    public void addPlanet(Planet planet) {
        planets.add(planet);
    }

    public int getPlanetCount() {
        return planets.size();
    }

    public String getStarName() {
        return star.getName();
    }

    public void printSystemInfo() {
        System.out.println("Звезда: " + getStarName());
        System.out.println("Количество планет: " + getPlanetCount());
        for (Planet planet : planets) {
            System.out.println("- Планета: " + planet.getName());
            for (Moon moon : planet.getMoons()) {
                System.out.println("  - Луна: " + moon.getName());
            }
        }
    }
}
