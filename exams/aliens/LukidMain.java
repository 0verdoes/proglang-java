import lukidPlanet.*;

class LukidMain{
    public static void main(String[] args){

        Lukid l1 = Lukid.makeLukid("Luki"),
              l2 = Lukid.Luko,
              l3 = Lukid.Luka,
              l4;
        System.out.println("Luki hash: " + l1.hashCode());
        l1.die();
        l4 = Lukid.makeLukid("Luki");
        System.out.println(l1.equals(l4));
        System.out.println("Luki hash: " + l4.hashCode());


    }
}