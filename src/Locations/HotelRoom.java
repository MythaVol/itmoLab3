package Locations;

import Items.Water;

public class HotelRoom extends Location{
    private Water hotWater;

    public void setHotWater(Water water){
        if(water.isHot())
            hotWater = water;
    }
}
