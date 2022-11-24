

package TravellingSalesman;

public class Places {
    int xcoordinate;
    int ycoordinate;


    public Places(){
        this.xcoordinate = (int)(Math.random()*200);
        this.ycoordinate = (int)(Math.random()*200);
    }

    // Constructs a city at chosen x, y location
    public Places(int xcoordinate, int ycoordinate){
        this.xcoordinate = xcoordinate;
        this.ycoordinate = ycoordinate;
    }


    public int getx(){
        return this.xcoordinate;
    }


    public int gety(){
        return this.ycoordinate;
    }


    public double calculatedistance(Places places){
        int xdis = Math.abs(getx() - places.getx());
        int ydist = Math.abs(gety() - places.gety());
        double distval = Math.sqrt( (xdis*xdis) + (ydist*ydist) );

        return distval;
    }

    @Override
    public String toString(){
        return getx()+", "+ gety();
    }
}