package com.example.localisationapp.service;

import com.example.localisationapp.classes.Position;

import java.util.ArrayList;
import java.util.List;

public class PositionServices {

    private List<Position> positions ;
    private static PositionServices instance;


    private PositionServices(){
        positions= new ArrayList<>();
    }

    public static synchronized PositionServices getInstance() {
        if (instance==null)
            instance = new PositionServices();
        return instance;
    }
    public List<Position> getPositions(){
        return positions;
    }
}
