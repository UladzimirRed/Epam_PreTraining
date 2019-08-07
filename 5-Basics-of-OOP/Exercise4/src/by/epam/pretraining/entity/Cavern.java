package by.epam.pretraining.entity;

import java.util.ArrayList;

public class Cavern {
    private ArrayList<Gold> goldInCave = new ArrayList<>(100);
    private static Cavern instance;

    public Cavern(){
        for (int i = 0; i < 10; i++){
            goldInCave.add(new Gold());
        }
    }

    public static Cavern getInstance(){
        if (instance == null){
            instance = new Cavern();
        }else {
            return instance;
        }
        return instance;
    }

    public ArrayList<Gold> getGoldInCave(){
        return goldInCave;
    }
}
