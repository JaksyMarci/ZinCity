package hu.nem3d.zincity;

import com.badlogic.gdx.maps.tiled.TiledMapTileLayer;

public class CityCell extends TiledMapTileLayer.Cell { //when Issue#21 is solved, this should be refactored as 'abstract'
    //CLASS FOR EACH TILE ON THE MAP
    //should contain logic data.
    //equivalent with "tile" class in UML diagram. Renamed to avoid confusion.

    protected int x, y; //necessary for selecting tiles

    //It may need a rework, but now for efficiency purposes, those are 2 booleans
    //Obviously, each tile starts with no wire, electricity
    protected boolean isElectrified = false;
    protected boolean isWired = false;

    public CityCell() {
        super();
        this.x = 0;
        this.y = 0;
    }

    public CityCell(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    public int getX() {return x;}
    public void setX(int x) {this.x = x;}

    public int getY() {return y;}
    public void setY(int y) {this.y = y;}

    public boolean isWired() {return isWired;}
    public void setWired(boolean wired) {isWired = wired;}

    public boolean isElectrified() {return isElectrified;}
    public boolean setElectrified(boolean elect) {
        if(elect){
            if (isWired){  //Electricity requires wires to flow through
                isElectrified = true;
                return true;
            }else{
                return false;
            }
        }else{
            isElectrified = false;
            return true;
        }

    }

    //Result of merging the Position and the Tile classes from UML
    public double distance(CityCell c){
        return Math.sqrt(Math.pow((c.getX()-this.x), 2) + Math.pow((c.getY()-this.y), 2));
    }

    //For efficiency purposes, it'll be useful for tile-seeking algorithm
    //It's easier to use this, than "(new Industrial()).getClass() == this.getClass()"
    public boolean isIndustrial(){return false;}
    public boolean isLiving(){return false;}
    public boolean isService(){return false;}
    public boolean isRoad(){return false;}
}
