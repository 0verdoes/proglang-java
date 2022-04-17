public enum WildAnimal {
    MONKEY("Banana", 20),
    ELEPHANT("Nuts", 3000),
    GIRAFFE("Leaves", 800),
    RACOON("Whatever", 10);

    private final String food;
    private final int    amount;


    WildAnimal(String food, int amount){
        this.amount = amount;
        this.food   = food;
    }

    public static String listAllAnimals(){
        StringBuilder sb = new StringBuilder();
        for(WildAnimal animal : WildAnimal.values()){
            sb.append(animal.ordinal()).append(". ").append(animal.toString());
            sb.append(" likes to eat").append(animal.food).append(".");
        }

        return sb.toString();
    }

    @Override
    public String toString(){
        switch(this){
            case MONKEY:
                return "monkey";
            case ELEPHANT:
                return "elephant";
            case GIRAFFE:
                return "giraffe";
            case RACOON:
                return "racoon";
            default:
                return "animal";
        }
    }
}
