package commerce.company;

import java.util.List;
import java.util.ArrayList;

public class PublicTransportCompany extends Company{
    
    private final List<String> places;

    public PublicTransportCompany(String name, int establishmentYear, List<String> places){
        super(name, establishmentYear);
        this.places = new ArrayList<>(places);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        
        sb.append(this.getName())
          .append(":")
          .append(this.getEstablishmentYear())
          .append(":");
        for(String str : this.places){
            sb.append(str)
              .append(",");
        }
        //remove last extra comma
        sb.deleteCharAt(sb.length()-1);
        
        return sb.toString();
    }

    public static PublicTransportCompany createFromString(String StringReprezentation){
        String[] fields = StringReprezentation.split(":");
        if(fields.length != 3){
            throw new IllegalArgumentException("Parameter must match format returned by toString!");
        }

        String name = fields[0];
        int    year = Integer.parseInt(fields[1]);
        String[] cities = fields[2].split(",");
        List<String> places = new ArrayList<>();
        for(String str: cities){
            places.add(str);
        }

        return new PublicTransportCompany(name, year, places);
    }

}
