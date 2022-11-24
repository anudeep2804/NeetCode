

package TravellingSalesman;

import java.util.ArrayList;
import java.util.Collections;

public class paths {


    private ArrayList path = new ArrayList<Places>();

    private double fitness = 0;
    private int distance = 0;


    public paths(){
        for (int i = 0; i < destinations.totalplaces(); i++) {
            path.add(null);
        }
    }

    public paths(ArrayList path){
        this.path = path;
    }


    public void getindividual() {
        // Loop through all our destination cities and add them to our tour
        for (int cityIndex = 0; cityIndex < destinations.totalplaces(); cityIndex++) {
            setplace(cityIndex, destinations.getplace(cityIndex));
        }

        Collections.shuffle(path);
    }


    public Places getplace(int tourPosition) {
        return (Places) path.get(tourPosition);
    }


    public void setplace(int tourPosition, Places places) {
        path.set(tourPosition, places);
        // If the routes been altered we need to reset the fitness and distance
        fitness = 0;
        distance = 0;
    }


    public double fitnesscalculation() {
        if (fitness == 0) {
            fitness = 1/(double) retrivedist();
        }
        return fitness;
    }

    // Gets the total distance of the route
    public int retrivedist(){
        if (distance == 0) {
            int tourDistance = 0;

            for (int citycounter = 0; citycounter < Routesize(); citycounter++) {

                Places fromPlaces = getplace(citycounter);

                Places destcity;

                if(citycounter+1 < Routesize()){
                    destcity = getplace(citycounter+1);
                }
                else{
                    destcity = getplace(0);
                }

                tourDistance += fromPlaces.calculatedistance(destcity);
            }
            distance = tourDistance;
        }
        return distance;
    }


    public int Routesize() {
        return path.size();
    }


    public boolean containsCity(Places places){
        return path.contains(places);
    }

    @Override
    public String toString() {
        String geneString = "|";
        for (int i = 0; i < Routesize(); i++) {
            geneString += getplace(i)+"|";
        }
        return geneString;
    }
}