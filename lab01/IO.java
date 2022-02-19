//Hello world in java
class IO {
    public static void main(String[] args) {
        System.out.println("Hogy hívnak?");
        String name = System.console().readLine();
        System.out.println("Hello " + name + "!");
    }
}
