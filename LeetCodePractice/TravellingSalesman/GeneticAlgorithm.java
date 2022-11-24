

package TravellingSalesman;

public class GeneticAlgorithm {


    private static final double mutationRate = 0.015;
    private static final int sizeoftournament = 5;
    private static final boolean elitism = true;


    public static Population evolve(Population popul) {
        Population newPopulation = new Population(popul.populationSize(), false);


        int elitimsoff = 0;
        if (elitism) {
            newPopulation.saveroute(0, popul.retrivefittest());
            elitimsoff = 1;
        }


        for (int i = elitimsoff; i < newPopulation.populationSize(); i++) {

            paths parent1 = tourselect(popul);
            paths parent2 = tourselect(popul);

            paths child = crossover(parent1, parent2);

            newPopulation.saveroute(i, child);
        }


        for (int i = elitimsoff; i < newPopulation.populationSize(); i++) {
            mutate(newPopulation.getTour(i));
        }

        return newPopulation;
    }


    public static paths crossover(paths parent1, paths parent2) {

        paths child = new paths();


        int startingpos = (int) (Math.random() * parent1.Routesize());
        int endingpos = (int) (Math.random() * parent1.Routesize());


        for (int i = 0; i < child.Routesize(); i++) {

            if (startingpos < endingpos && i > startingpos && i < endingpos) {
                child.setplace(i, parent1.getplace(i));
            }
            else if (startingpos > endingpos) {
                if (!(i < startingpos && i > endingpos)) {
                    child.setplace(i, parent1.getplace(i));
                }
            }
        }


        for (int i = 0; i < parent2.Routesize(); i++) {

            if (!child.containsCity(parent2.getplace(i))) {

                for (int ii = 0; ii < child.Routesize(); ii++) {

                    if (child.getplace(ii) == null) {
                        child.setplace(ii, parent2.getplace(i));
                        break;
                    }
                }
            }
        }
        return child;
    }


    private static void mutate(paths paths) {

        for(int tourPos1 = 0; tourPos1 < paths.Routesize(); tourPos1++){

            if(Math.random() < mutationRate){

                int tourPos2 = (int) (paths.Routesize() * Math.random());


                Places places1 = paths.getplace(tourPos1);
                Places places2 = paths.getplace(tourPos2);

                paths.setplace(tourPos2, places1);
                paths.setplace(tourPos1, places2);
            }
        }
    }


    private static paths tourselect(Population pop) {

        Population tournament = new Population(sizeoftournament, false);

        for (int i = 0; i < sizeoftournament; i++) {
            int randomId = (int) (Math.random() * pop.populationSize());
            tournament.saveroute(i, pop.getTour(randomId));
        }

        paths fittest = tournament.retrivefittest();
        return fittest;
    }
}