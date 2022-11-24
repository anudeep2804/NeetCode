

package TravellingSalesman;

import java.util.ArrayList;

public class destinations {


    private static ArrayList destplaces = new ArrayList<Places>();


    public static void addplace(Places places) {
        destplaces.add(places);
    }


    public static Places getplace(int index){
        return (Places) destplaces.get(index);
    }


    public static int totalplaces(){
        return destplaces.size();
    }
}