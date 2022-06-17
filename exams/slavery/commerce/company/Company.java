package commerce.company;

public abstract class Company{

    final String name;//maybe protected
    final int    establishmentYear;

    public Company(String name, int establishmentYear){
        this.name              = name;
        this.establishmentYear = establishmentYear;
    }

    public String getName(){
        return this.name;
    }

    public int getEstablishmentYear(){
        return this.establishmentYear;
    }
}
