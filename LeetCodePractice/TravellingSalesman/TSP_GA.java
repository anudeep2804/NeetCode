

package TravellingSalesman;

public class TSP_GA {

    public static void main(String[] args) {

        // Create and add our cities
        Places places = new Places(60, 200);
        destinations.addplace(places);
        Places places2 = new Places(180, 200);
        destinations.addplace(places2);
        Places places3 = new Places(80, 180);
        destinations.addplace(places3);
        Places places4 = new Places(140, 180);
        destinations.addplace(places4);
        Places places5 = new Places(20, 160);
        destinations.addplace(places5);
        Places places6 = new Places(100, 160);
        destinations.addplace(places6);
        Places places7 = new Places(200, 160);
        destinations.addplace(places7);
        Places places8 = new Places(140, 140);
        destinations.addplace(places8);
        Places places9 = new Places(40, 120);
        destinations.addplace(places9);
        Places places10 = new Places(100, 120);
        destinations.addplace(places10);
        Places places11 = new Places(180, 100);
        destinations.addplace(places11);
        Places places12 = new Places(60, 80);
        destinations.addplace(places12);
        Places places13 = new Places(120, 80);
        destinations.addplace(places13);
        Places places14 = new Places(180, 60);
        destinations.addplace(places14);
        Places places15 = new Places(20, 40);
        destinations.addplace(places15);
        Places places16 = new Places(100, 40);
        destinations.addplace(places16);
        Places places17 = new Places(200, 40);
        destinations.addplace(places17);
        Places places18 = new Places(20, 20);
        destinations.addplace(places18);
        Places places19 = new Places(60, 20);
        destinations.addplace(places19);
        Places places20 = new Places(160, 20);
        destinations.addplace(places20);

        // Initialize population
        Population pop = new Population(50, true);
        System.out.println("Initial distance: " + pop.retrivefittest().retrivedist());

        // Evolve population for 100 generations
        pop = GeneticAlgorithm.evolve(pop);
        for (int i = 0; i < 100; i++) {
            pop = GeneticAlgorithm.evolve(pop);
        }


        System.out.println("Finished");
        System.out.println("Final distance: " + pop.retrivefittest().retrivedist());
        System.out.println("Solution:");
        System.out.println(pop.retrivefittest());
    }
}