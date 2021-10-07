package main;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {

    private List<Salmon> aquarium = new ArrayList<>();

    public Aquarium(){

        this.aquarium.add(new Salmon("Snappy","Scottish",0));

    }

    public List<Salmon> getAquarium() {
        return this.aquarium;
    }

    public String toString(){
        String json = new Gson().toJson(aquarium);
        return json;
    }

}
