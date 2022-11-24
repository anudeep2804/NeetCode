

package TravellingSalesman;

public class Population {


    paths[] routes;


    public Population(int populationSize, boolean initialise) {
        routes = new paths[populationSize];

        if (initialise) {

            for (int i = 0; i < populationSize(); i++) {
                paths newPaths = new paths();
                newPaths.getindividual();
                saveroute(i, newPaths);
            }
        }
    }

    public void saveroute(int index, paths paths) {
        this.routes[index] = paths;
    }

    public paths getTour(int index) {
        return routes[index];
    }


    public paths retrivefittest() {
        paths fittest = routes[0];

        for (int i = 1; i < populationSize(); i++) {
            if (fittest.fitnesscalculation() <= getTour(i).fitnesscalculation()) {
                fittest = getTour(i);
            }
        }
        return fittest;
    }


    public int populationSize() {
        return routes.length;
    }
}