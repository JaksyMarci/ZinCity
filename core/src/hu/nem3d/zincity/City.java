package hu.nem3d.zincity;


import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TiledMapTileLayer;

import java.util.ArrayList;

public class City {
    //still a skeleton
    public ArrayList<?> citizens; //implement citizen class for this


    public double budget;
    public double taxCoefficient = 1.0; //double between 0.8-1.2, can be changed by player
    public final double baseTaxAmount = 50; //tax per citizen

    public double satisfaction; //sum of satisfactions
    public final double satisfactionUpperThreshold = 0.2; //above this number, it's possible to receive new inhabitants
    public final double satisfactionLowerThreshold = -0.2; //below this, a citizen may flee.

    public TiledMap map;

    public City() {
    }
    public void step(){
        for (Object citizen : citizens) {
            //update satisfaction of each citizen
            //update satisfaction of whole city
            //collect tax
        }
        TiledMapTileLayer buildingLayer = (TiledMapTileLayer)map.getLayers().get(1);
        for (int i = 0; i < 30; i++){ //no forall here unfortunately
            for (int j = 0; j < 20; j++){
                buildingLayer.getCell(i,j);
                //do logic with cell here
            }

        }
    }

}