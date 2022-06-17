package lukidPlanet;

import java.util.Set;
import lukidPlanet.errors.OccupiedNameException;
import java.util.HashSet;

public class NamedEntity {

    protected static Set<String> names = new HashSet<>();

    private String name;

    protected NamedEntity(String name) throws OccupiedNameException{
        if(NamedEntity.names.contains(name)){
            throw new OccupiedNameException(name);
        }
        this.name = name;
        names.add(name);
    }

    public String getName(){
        return name;
    }

 }