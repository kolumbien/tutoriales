package javamaster.generics.interfacesgenerics;

import java.util.ArrayList;

public class League < T extends Team>{

    private ArrayList<T> league = new ArrayList<>();

    public boolean add(T team){
        if(league.contains(team))
            return false;

        league.add(team);
        return true;

    }
}
