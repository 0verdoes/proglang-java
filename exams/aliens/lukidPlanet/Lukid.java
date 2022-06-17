package lukidPlanet;

import java.util.jar.Attributes.Name;

import lukidPlanet.errors.OccupiedNameException;

public class Lukid extends NamedEntity{
    
    public static final Lukid Luka = Lukid.makeLukid("Luka");
    public static final Lukid Luko = Lukid.makeLukid("Luko");
    
    private Lukid(String name) throws OccupiedNameException{
        super(name);
        System.out.println(name + " has been borned.");
    }

    public static Lukid makeLukid(String name){
        try {
            return new Lukid(name);   
        } catch (OccupiedNameException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }

    public void die(){
        if(this == Lukid.Luka || this == Lukid.Luko){
            System.out.println("Luko and Luka are immortal.");
            return;
        }

        //this.getName Add extra "Lukid " to the beggining -> this cuts it out
        if(!NamedEntity.names.remove(this.getName())){
            NamedEntity.names.remove(this.getName().split(" ")[1]);
        }
        System.out.println(this.getName() + " has died."); 
    }

    @Override
    public boolean equals(Object other){
        if(other == null || !(other instanceof Lukid)){
            return false;
        }

        Lukid that = (Lukid) other;
        return this.getName().equals(that.getName());
    }

    @Override
    public int hashCode(){
        return this.getName().hashCode();
    }

    @Override
    public String getName(){
        return "Lukid " + super.getName();
    }

}
