package lukidPlanet.errors;

public class OccupiedNameException extends Exception{

    public OccupiedNameException(String name){
        super("the following name is occupied: " + name);
    }

    public OccupiedNameException(){
        super();
    }
}
