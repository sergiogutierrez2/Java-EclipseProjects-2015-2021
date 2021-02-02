
public class PlanetarySystemTester {

    public static void main(String[] args) 
  {
    	 Star sun = new Star(2000000, "Sun");
    	 Star aldebaran = new Star(3000000, "Aldebaran");
    	 Planet earth = new Planet(195, "Earth");
    	 Planet jupiter = new Planet(1234, "Jupiter");
    	 Planet aldebaranB = new Planet(4600, "Aldebaran b");
    	 Planet abc = new Planet(142, "Abc");
    	 Asteroid ceres = new Asteroid(42, "Ceres");
    	 Asteroid noName = new Asteroid(3);
    	 // you can create more AstronomicalBodies
    	 
    	 PlanetarySystem solarSystem = new PlanetarySystem();
    	 solarSystem.add(sun);
    	 // should not be added and should not replace
    	 // sun as solarSystem star
    	 // since solarSystem star was already set
    	 solarSystem.add(aldebaran);
    	 solarSystem.add(earth);
    	 solarSystem.add(ceres);
    	 // you can add more AstornomicalBodies
    	 // to your planetary systems
    	 // should call overridden toString
    	 System.out.println("SolarSystem");
    	 System.out.println(solarSystem);
    	 // create two other PlanetarySystem
    	 // one should produce true when calling equals
    	 // method comparing with solarSystem
    	 // another should produce false 
    	 
    	 //MY WORK:

    	 Star orion = new Star(3500, "Orion");
    	 Planet terra = new Planet(195, "Terra");
    	 Asteroid xandar = new Asteroid(3);
    	 Asteroid vormir = new Asteroid (5, "Vormir");
    	 
    	 PlanetarySystem lylatSystem = new PlanetarySystem();
    	 PlanetarySystem samusSystem = new PlanetarySystem();
    	 PlanetarySystem earthSystem = new PlanetarySystem();
    	 
    	 lylatSystem.add(orion);
    	 lylatSystem.add(terra);
    	 lylatSystem.add(earth);
    	 
    	 samusSystem.add(xandar);
    	 samusSystem.add(vormir);
    	 
    	 earthSystem.add(sun);
    	 earthSystem.add(aldebaran);
    	 earthSystem.add(earth);
    	 earthSystem.add(ceres);
    	 
    	 System.out.println("LylatSystem");
    	 System.out.println(lylatSystem);
    	 System.out.println("SamusSystem");
    	 System.out.println(samusSystem);
    	 System.out.println("EarthSystem");
    	 System.out.println(earthSystem);
    	 
    	 System.out.println("Are SolarSystem and LylatSystem equal? ");
    	 System.out.println(solarSystem.equals(lylatSystem));
    	 
    	 System.out.println("Are SolarSystem and SamusSystem equal? ");
    	 System.out.println(solarSystem.equals(samusSystem));
    	 
    	 System.out.println("Are SolarSystem and EarthSystem equal? ");
    	 System.out.println(solarSystem.equals(earthSystem));
    	 
    	 Object obj = earthSystem;
    	 obj.toString();
    	 
    	 System.out.println("Are SolarSystem and EarthSystem equal? ");
    	 System.out.println(obj.toString());
  }
}
