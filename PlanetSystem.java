import java.util.ArrayList;

public class PlanetSystem {
    private String name;
    private Star centerStar;    //Her hadde jeg først String centerStar, men fik hjelp av chatgp
    private ArrayList<Planet> planets;

    public PlanetSystem(String name, Star centerStar, ArrayList<Planet> planets){
        this.name = name;
        this.centerStar = centerStar;
        this.planets = planets;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public Star getCenterStar() {
        return centerStar;
    }


    public void setCenterStar(Star centerStar) {
        this.centerStar = centerStar;
    }

    public ArrayList<Planet> getPlanets() {
        return planets;
    }

    public void setPlanets(ArrayList<Planet> planets) {
        this.planets = planets;
    }

    public String toString() {
        return "In the center of our "+ name + " the planets orbits around the "+ centerStar;
    }
}
