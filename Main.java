import java.util.ArrayList;

public class Main {
        public static void main(String[] args) {
           
            Star sun = new Star("Sun", 1.0, 1.0, 5777);            
        
            Planet mercury = new Planet("Mercury", 0.03412549655905556, 1.7297154899894627E-4);
            Planet venus = new Planet("Venus", 0.08465003077267387, 0.002564278187565859);
            Planet earth = new Planet("Earth", 0.089114865998992890, 0.0031464699683877770);
            Planet mars = new Planet("Mars", 0.04741089912158004, 3.3667017913593256E-4);
            Planet jupiter = new Planet("Jupiter", 1.0, 1.0);
            Planet saturn = new Planet("Saturn", 0.8145247020645666, 0.2994204425711275);
            Planet uranus = new Planet("Uranus", 0.35475297935433336, 0.04573761854583773);
            Planet neptune = new Planet("Neptune", 0.34440217087226543, 0.05395152792413066);

            //Fikk hjelp av chatgpt til å legge inn riktig /første forsøk skrev jeg "SolarSystem.add(mercury) osv"
            ArrayList<Planet> planets = new ArrayList<>();
            planets.add(mercury);
            planets.add(venus);
            planets.add(earth);
            planets.add(mars);
            planets.add(jupiter);
            planets.add(saturn);
            planets.add(uranus);
            planets.add(neptune);

            PlanetSystem SolarSystem = new PlanetSystem("Solar system", sun, planets);
            
            // https://www.javatpoint.com/understanding-toString()-method
            System.out.println(SolarSystem);
            
        }
}
