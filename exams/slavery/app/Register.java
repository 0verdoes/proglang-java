package app;

import java.util.Set;
import java.util.HashSet;
import commerce.company.*;

public class Register {
    
    public static void main(String[] args) {
        
        Set<PublicTransportCompany> companies = new HashSet<>();
        for(String str: args){
            companies.add(PublicTransportCompany.createFromString(str));
        }

        System.out.println("Size of Set: "+ companies.size());
        for(PublicTransportCompany company : companies){
            System.out.println(company);
        }
    }
}
